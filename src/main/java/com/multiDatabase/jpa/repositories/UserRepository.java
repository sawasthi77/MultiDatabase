package com.multiDatabase.jpa.repositories;

import com.multiDatabase.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
