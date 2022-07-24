package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    User findById(Long id);

    List<User> findAllUsers();

    void deleteUser(Long id);

    void addRole(User user);

    User findUserByUsername(String username);
}
