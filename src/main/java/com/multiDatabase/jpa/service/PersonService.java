package com.multiDatabase.jpa.service;

import com.multiDatabase.jpa.annotation.LogExecutionTime;
import com.multiDatabase.jpa.entities.User;
import com.multiDatabase.jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private UserRepository userRepository;

    @LogExecutionTime
    public List<User> getAllUsers() throws InterruptedException {
        Thread.sleep(1000);
        return userRepository.findAll();
    }
}
