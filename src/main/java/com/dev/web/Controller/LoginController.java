package com.dev.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cosxt on 9/22/2016.
 */
@Controller
@RequestMapping()
public class LoginController {

    @GetMapping("/login")
    public String openLoginPage() {
        return "login";
    }

    @PostMapping("/logout")
    public String logout() {
        return "login";
    }
}
