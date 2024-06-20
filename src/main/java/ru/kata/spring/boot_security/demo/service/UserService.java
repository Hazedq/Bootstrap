package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);


    List<User> findAll();

    void saveUser(User user);

    void deleteUserById(long userId);
    void adminRedactor(User user, Long id);
}