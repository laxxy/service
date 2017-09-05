package com.dev.web.Service;

import com.dev.web.Entity.User;

import java.util.List;

/**
 * Created by cosxt on 12/8/2016.
 */
public interface UserDAO {
    User getUserByEmail(String email);
    void add(User user);
    List<User> listUsers();
}
