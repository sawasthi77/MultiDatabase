package com.multiDatabase.jpa.repositories;

import com.multiDatabase.jpa.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepositories extends MongoRepository<Product, String> {
}
