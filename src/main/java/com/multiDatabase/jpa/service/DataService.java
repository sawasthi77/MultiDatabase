package com.multiDatabase.jpa.service;

import com.multiDatabase.jpa.entities.Product;
import com.multiDatabase.jpa.entities.User;
import com.multiDatabase.jpa.repositories.ProductRepositories;
import com.multiDatabase.jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepositories productRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
