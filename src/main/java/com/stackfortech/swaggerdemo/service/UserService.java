package com.stackfortech.swaggerdemo.service;

import com.stackfortech.swaggerdemo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User add(User user);
    public List<User> fetchAll();
}
