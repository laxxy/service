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

    private final static String path = "https://booking.uz.gov.ua/ru/train_search/";
    private URL url;

    public RequestContext() throws MalformedURLException {
        url = new URL(path);
    }

    public RequestContext setUrl(URL url) {
        this.url = url;
        return this;
    }

    public String generateQueueRequest(UserRequest userRequest) {
        return "from=" + userRequest.getStationIdFrom() +
        "&to=" + userRequest.getStationIdTo() +
        "&date=" + userRequest.getDateDep() +
        "&time=00:00";
    }

    public URL getUrl() {
        return url;
    }
}
