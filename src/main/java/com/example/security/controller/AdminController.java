package com.example.security.controller;

import com.example.security.entity.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "api/v1/admins")
public class AdminController {

    private static ArrayList<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 120000.0, 1));
        products.add(new Product(2, "Product 21", 180000.0, 1));
        products.add(new Product(3, "Product 3", 145000.0, 1));
        products.add(new Product(4, "Product 4", 1520000.0, 1));
        products.add(new Product(5, "Product 5", 130000.0, 1));
    }


}
