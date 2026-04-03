package chuwa3926.Coding.service;

import chuwa3926.Coding.annotation.Autowired;
import chuwa3926.Coding.annotation.Component;

@Component
public class OrderService {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    public UserService getUserService() {
        return userService;
    }

    public ProductService getProductService() {
        return productService;
    }
}
