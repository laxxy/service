package com.dev.web.Service;

import com.dev.web.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cosxt on 9/4/2017.
 */
//@Service
//@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }
}
