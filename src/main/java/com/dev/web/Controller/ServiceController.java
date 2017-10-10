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

    @PostMapping
    public UserRequest getAvailableTrains(@RequestBody UserRequest userRequest) {
        String station_from = userRequest.getStation_from();
        String station_till = userRequest.getStation_till();
        return new UserRequest();
    }
}
