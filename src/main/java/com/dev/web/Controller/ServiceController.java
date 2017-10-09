package com.dev.web.Controller;

import com.dev.web.Entity.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cosxt on 9/20/2017.
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    //@RequestMapping(method = RequestMethod.POST)
    //@ResponseBody
    @PostMapping
    public UserRequest getAvailableTrains(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest + " <<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return new UserRequest();
    }
}
