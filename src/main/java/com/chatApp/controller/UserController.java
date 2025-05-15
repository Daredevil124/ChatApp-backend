package com.chatApp.controller;
import java.util.*;
import com.chatApp.repository.*;
import com.chatApp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
