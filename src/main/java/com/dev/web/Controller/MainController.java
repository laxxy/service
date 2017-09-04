package com.dev.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cosxt on 9/28/2016.
 */
@Controller
@RequestMapping
public class MainController {

    @GetMapping("/")
    public String getMainPage() {
        return "redirect:/login";
    }

    @GetMapping("/error")
    public String getErrorPage() {
        return "error";
    }
}
