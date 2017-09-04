package com.dev.web.Service;

import com.dev.web.Entity.User;

import java.util.List;

/**
 * Created by cosxt on 9/4/2017.
 */
public interface UserService {
    void add(User user);
    List<User> listUsers();
}
