package com.dev.web.Controller;

import com.dev.web.Entity.UserRequest;
import com.dev.web.core.Constants;
import com.dev.web.core.RequestContext;
import com.dev.web.core.UserQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

/**
 * Created by cosxt on 9/20/2017.
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private UserQueue userQueue;

    @Async
    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CompletableFuture<UserRequest> startQueue(@RequestBody UserRequest userRequest) throws MalformedURLException, InterruptedException {
        String station_from = userRequest.getStation_from();
        String station_till = userRequest.getStation_till();
        String dateDep = userRequest.getDateDep();
        userRequest.setDesiredTrain(Constants.TRAIN);
        userRequest.setDesiredClass(Constants.CLASS);
        userRequest.setStationIdFrom(Constants.KYIV_ID);
        userRequest.setStationIdTo(Constants.RIVNE_ID);

        System.out.println(station_from + " ||| " + station_till + " ||| " + dateDep + "<<<<<<<<<<<<<<<<<<");
        /*return () -> {
            userQueue.startQueue(new RequestContext(), userRequest);
            Thread.sleep(15000);
            return userRequest;
        };*/
        userQueue.startQueue(new RequestContext(), userRequest);
        //Thread.sleep(15000);
        return CompletableFuture.completedFuture(userRequest);
    }
}
