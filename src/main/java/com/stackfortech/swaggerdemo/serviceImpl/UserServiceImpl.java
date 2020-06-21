package com.stackfortech.swaggerdemo.serviceImpl;

import com.stackfortech.swaggerdemo.domain.User;
import com.stackfortech.swaggerdemo.repository.UserRepository;
import com.stackfortech.swaggerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchAll() {
       return userRepository.findAll();
    }
}
