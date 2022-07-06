package com.expressanalytics.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.expressanalytics.data.models.UserDao;


public interface UserRepository extends JpaRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}