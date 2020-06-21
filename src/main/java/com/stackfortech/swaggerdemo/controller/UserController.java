package com.stackfortech.swaggerdemo.controller;

import com.stackfortech.swaggerdemo.domain.User;
import com.stackfortech.swaggerdemo.service.UserService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    @ApiOperation(value = "This API returns basic hello message")
    @ApiResponse(code = 200, message = "Returns hello as response", response = String.class)
    public String hello(){
        return "hello";
    }

    @GetMapping("/users")
    @ApiOperation(value = "This API returns all users")
    public List<User> getAll()
    {
        return userService.fetchAll();
    }

    @PostMapping("/user")
    @ApiOperation(value = "This API create a user")
    public User add(@RequestBody User user)
    {
        return userService.add(user);
    }
}
