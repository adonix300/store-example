package org.example.storage;

import org.example.entities.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.constants.UserConstants.INITIAL_MONEY; // magic numbers

public class UserStorage {
    private final Map<Long, User> users;

    public Map<Long, User> getUsers() {
        return users;
    }

    public UserStorage() {
        this.users = new HashMap<>();
        List.of(new User(INITIAL_MONEY,"user1",1),
                new User(INITIAL_MONEY,"user2",2))
                .forEach(user -> users.put(user.getId(), user));

    }

}
