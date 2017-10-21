package com.dev.web.core;

import com.dev.web.Entity.UserRequest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public class RequestContext {

    private final static String path = "https://booking.uz.gov.ua/ru/purchase/search/";
    private URL url;

    public RequestContext() throws MalformedURLException {
        url = new URL(path);
    }

    public RequestContext setUrl(URL url) {
        this.url = url;
        return this;
    }

    public String generateQueueRequest(UserRequest userRequest) {
        /*Map<String, String> parameters = new LinkedHashMap<>();
        parameters.put("station_id_from", "2200001");
        parameters.put("station_id_till", "2218000");
        parameters.put("station_from", userRequest.getStation_from());
        parameters.put("station_till", userRequest.getStation_till());
        parameters.put("date_dep", userRequest.getDateDep());
        parameters.put("time_dep", "17:00");
        parameters.put("time_dep_till", "");
        parameters.put("another_ec", "0");
        parameters.put("search", "");*/

        return "station_id_from=2200001" +
        "&station_id_till=2218000" +
        "&station_from=" + userRequest.getStation_from() +
        "&station_till=" + userRequest.getStation_till() +
        "&date_dep=" + userRequest.getDateDep() +
        "&time_dep=00:00" +
        "&time_dep_till=" +
        "&another_ec=0" +
        "&search=";
    }

    public URL getUrl() {
        return url;
    }
}
