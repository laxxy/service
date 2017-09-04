package com.dev.web.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by cosxt on 11/23/2016.
 */
@Entity(name = "Users")
@Table(name = "users")
public class User {

    private Long id;
    private String email;
    private String password;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "USER_ID")
    public Long getId() {
        return id;
    }

    @Column(name = "USER_PASSWORD")
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Column(name = "USER_EMAIL")
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
