package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

 public 	User findByUserNameAndPassword(String userName, String password);

public User saveUser(User user1);

public List<User> findAllEmployee();

}
