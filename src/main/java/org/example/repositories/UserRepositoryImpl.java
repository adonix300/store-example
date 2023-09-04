package org.example.repositories;

import org.example.entities.User;
import org.example.storage.UserStorage;

import java.util.Optional;

public class UserRepositoryImpl implements UserRepository { //Single responsibility
    private final UserStorage userStorage = new UserStorage();
    @Override
    public Optional<User> findByName(String name) {
        return userStorage.getUsers().values().stream().filter(value -> value.getName().equals(name)).findFirst();
    }

    @Override
    public User getById(long id) {
        return userStorage.getUsers().get(id);
    }

    @Override
    public void addMoney(User currentUser, Integer money) {
        currentUser.setMoney(currentUser.getMoney() + money);
    }
}
