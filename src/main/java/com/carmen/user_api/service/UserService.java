package com.carmen.user_api.service;

import com.carmen.user_api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Carmen", "carmen@test.com"));
        users.add(new User(2, "Alejandro", "alejandro@test.com"));

        return users;
    }

}
