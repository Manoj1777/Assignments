package com.jpa.test.bootjpaexample.dao;

import com.jpa.test.bootjpaexample.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
