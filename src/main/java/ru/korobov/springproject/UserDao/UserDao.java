package ru.korobov.springproject.UserDao;


import ru.korobov.springproject.model.User;

import java.util.List;

public interface UserDao {

    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();

}
