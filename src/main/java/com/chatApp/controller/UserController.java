package com.chatApp.controller;
import java.util.*;

import com.chatApp.model.*;
import org.springframework.web.bind.annotation.*;
import com.chatApp.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return userService.findUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable String id) {
        return userService.findUserById(id);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }
}
