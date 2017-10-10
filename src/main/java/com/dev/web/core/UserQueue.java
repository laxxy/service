package com.dev.web.core;

import com.dev.web.Entity.UserRequest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by cosxt on 10/9/2017.
 */
public class UserQueue {

    public void startQueue(UserRequest userRequest) {

    }

    private String sendRequest(UserRequest userRequest) {
        return "";
    }

    private RequestContext getRequestContext() {
        try {
            return new RequestContext();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        throw new Error();
    }

    private String getParameters(UserRequest userRequest) {
       return String.format("station_id_from=%s" +
                "&station_id_till=%s" +
                "&station_from=%s" +
                "&station_till=%s" +
                "&date_dep=%s" +
                "&time_dep=%s" +
                "&time_dep_till=" +
                "&another_ec=0" +
                "&search=",
               userRequest.getStationIdFrom(),
               userRequest.getStationIdTo(),
               userRequest.getStation_from(),
               userRequest.getStation_till(),
               userRequest.getDateDep(),
               userRequest.getTimeDep());
    }


}
