package ru.korobov.springproject.service;


import ru.korobov.springproject.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(Long userId);
    void updateUser(User user);
    User getUserById(Long userId);
}
