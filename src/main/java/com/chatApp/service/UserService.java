package com.chatApp.service;

import com.chatApp.model.User;
import com.chatApp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findUsers() {
        return userRepository.findAll().stream().toList();
    }

    public Optional<User> findUserById(String id) {
        return userRepository.findById(id);
    }

    public User add(User user) {
        return userRepository.save(user);
    }
}
