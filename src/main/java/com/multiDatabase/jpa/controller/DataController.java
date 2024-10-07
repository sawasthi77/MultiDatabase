package com.multiDatabase.jpa.controller;

import com.multiDatabase.jpa.entities.Product;
import com.multiDatabase.jpa.entities.User;
import com.multiDatabase.jpa.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return dataService.getAllUsers();
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return dataService.getAllProducts();
    }
}
