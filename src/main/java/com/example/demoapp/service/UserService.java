package com.example.demoapp.service;

import com.example.demoapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    Optional<User> findUserById(int id);
}