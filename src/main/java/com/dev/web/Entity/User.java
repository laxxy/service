package com.dev.web.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by cosxt on 11/23/2016.
 */
@Entity
@Table(name = "USERS")
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

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "USER_EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
