package org.example.repositories;

import org.example.entities.User;

import java.util.Optional;

public interface UserRepository { // Interface segregation

    Optional<User> findByName(String name);

    User getById(long id);

    void addMoney(User currentUser, Integer money);
}
