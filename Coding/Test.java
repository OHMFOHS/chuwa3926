package chuwa3926.Coding;

import chuwa3926.Coding.factory.BeanFactory;
import chuwa3926.Coding.service.OrderService;
import chuwa3926.Coding.service.OtherService;
import chuwa3926.Coding.service.ProductService;
import chuwa3926.Coding.service.UserService;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory("chuwa3926.Coding.service");
        //Test singleton
        UserService u1 = factory.getBean(UserService.class);
        UserService u2 = factory.getBean(UserService.class);
        System.out.println("singleton test: " + (u1 == u2));

        //Test prototype
        ProductService p1 = factory.getBean(ProductService.class);
        ProductService p2 = factory.getBean(ProductService.class);
        System.out.println("prototype test: " + (p1 == p2));

        //Test autowired
        OrderService orderService = factory.getBean(OrderService.class);
        System.out.println("autowired test: " + (orderService.getUserService() != null));
        System.out.println("autowired test: " + (orderService.getProductService() != null));

        //Test Component
        //OtherService o1 = factory.getBean(OtherService.class);

    }
}
