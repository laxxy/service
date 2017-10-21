package com.dev.web.Controller;

import com.dev.web.Entity.UserRequest;
import com.dev.web.core.RequestContext;
import com.dev.web.core.UserQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;

/**
 * Created by cosxt on 9/20/2017.
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private UserQueue userQueue;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserRequest startQueue(@RequestBody UserRequest userRequest) throws MalformedURLException {
        String station_from = userRequest.getStation_from();
        String station_till = userRequest.getStation_till();
        String dateDep = userRequest.getDateDep();

        System.out.println(station_from + " ||| " + station_till + " ||| " + dateDep + "<<<<<<<<<<<<<<<<<<");

        //userQueue.startQueue(new RequestContext(), userRequest);
        return new UserRequest();
    }
}
