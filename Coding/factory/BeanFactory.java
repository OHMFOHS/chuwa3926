package chuwa3926.Coding.factory;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.*;

import chuwa3926.Coding.annotation.Autowired;
import chuwa3926.Coding.annotation.Component;
import chuwa3926.Coding.annotation.Scope;

public class BeanFactory {
    //class -> object
    private Map<Class<?>, Object> singletonObjects = new HashMap<>();
    private Set<Class<?>> beanDefinitions = new HashSet<>();

    public BeanFactory(String basePackage) {
         scanComponents(basePackage);
    }

    public <T> T getBean(Class<T> clazz) {

        if (!beanDefinitions.contains(clazz)) {
            throw new RuntimeException(clazz.getName() + " is not a managed component");
        }

        String scope = getScope(clazz);
        if ("singleton".equals(scope)) {
            if (singletonObjects.containsKey(clazz)) {
                return clazz.cast(singletonObjects.get(clazz));
            }
            T instance = createBean(clazz);
            singletonObjects.put(clazz, instance);
            return instance;
        } else if("prototype".equals(scope)) {
            return createBean(clazz);
        } else {
            throw new RuntimeException("Unknown scope: " + scope);
        }
    }

    private String getScope(Class<?> clazz) {
        if(clazz.isAnnotationPresent(Scope.class)) {
            Scope scope = clazz.getAnnotation(Scope.class);
            return scope.value();
        }
        return "singleton";
    }

    private <T> T createBean(Class<T> clazz) {
        try {
            //1. create current object
            T instance = clazz.getDeclaredConstructor().newInstance();
            //2. iterate all fields of this class
            for (Field field : clazz.getDeclaredFields()) {
                //3. if current field has @Autowired annotation
                if (field.isAnnotationPresent(Autowired.class)) {
                    field.setAccessible(true);
                    //4. get dependency type
                    Class<?> dependencyType = field.getType();
                    //5. get object from factory
                    Object dependency = getBean(dependencyType);
                    //6. dependency injection
                    field.set(instance, dependency);
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void scanComponents(String basePackage) {
        //convert package name into path
        String path = basePackage.replace('.', '/');

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource(path);

        if (resource == null) {
            throw new RuntimeException("Package Not Found: " + basePackage);
        }

        File directory = new File(resource.getFile());

        for (File file : directory.listFiles()) {
            if(file.getName().endsWith(".class")) {
                String className = basePackage + "." + file.getName().replace(".class", "");
                try {
                    Class<?> clazz = Class.forName(className);
                    if (clazz.isAnnotationPresent(Component.class)) {
                        beanDefinitions.add(clazz);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
