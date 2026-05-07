package com.spring.ecomproj.controller;

import com.spring.ecomproj.model.Product;
import com.spring.ecomproj.service.ProdcutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProdcutService prodcutService;

    @RequestMapping("/")
    public  String greet(){
        return "hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return prodcutService.getAllProducts();
    }
}
