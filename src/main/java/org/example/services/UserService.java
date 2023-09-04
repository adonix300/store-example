package org.example.services;


import org.example.entities.User;
import org.example.repositories.UserRepository;
import org.example.repositories.UserRepositoryImpl;


public class UserService {
    private final UserRepository userRepository = new UserRepositoryImpl();

    public User login(String name) throws IllegalAccessException {
        return userRepository.findByName(name).orElseThrow(() -> new IllegalAccessException("User not found"));
    }

    public void addMoney(User currentUser, Integer money) {
        userRepository.addMoney(currentUser, money);
    }
}
