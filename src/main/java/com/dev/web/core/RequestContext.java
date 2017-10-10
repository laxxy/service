package com.dev.web.core;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public class RequestContext {

    private final static String path = "http://booking.uz.gov.ua/ru/purchase/search";
    private URL url;

    private String urlParameters;

    public RequestContext() throws MalformedURLException {
        url = new URL(path);
    }

    public URL getUrl() {
        return url;
    }

    public RequestContext setUrl(URL url) {
        this.url = url;
        return this;
    }

    public String getUrlParameters() {
        return urlParameters;
    }

    public RequestContext setUrlParameters(String urlParameters) {
        this.urlParameters = urlParameters;
        return this;
    }
}
