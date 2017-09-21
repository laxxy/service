package com.dev.web.Controller;

import com.dev.web.Entity.UserRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cosxt on 9/20/2017.
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @PostMapping
    public void getAvailableTrains(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest + " <<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
