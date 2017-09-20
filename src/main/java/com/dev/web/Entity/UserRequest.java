package com.dev.web.Entity;

/**
 * Created by cosxt on 9/20/2017.
 */
public class UserRequest {

    private String stationIdFrom;
    private String stationIdTo;
    private String stationFrom;
    private String stationTo;
    private String dateDep;
    private String timeDep;
    private String timeDepTill;
    private String anotherEc;
    private String search;

    public UserRequest() {}

    public String getStationIdFrom() {
        return stationIdFrom;
    }

    public void setStationIdFrom(String stationIdFrom) {
        this.stationIdFrom = stationIdFrom;
    }

    public String getStationIdTo() {
        return stationIdTo;
    }

    public void setStationIdTo(String stationIdTo) {
        this.stationIdTo = stationIdTo;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String stationFrom) {
        this.stationFrom = stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String stationTo) {
        this.stationTo = stationTo;
    }

    public String getDateDep() {
        return dateDep;
    }

    public void setDateDep(String dateDep) {
        this.dateDep = dateDep;
    }

    public String getTimeDep() {
        return timeDep;
    }

    public void setTimeDep(String timeDep) {
        this.timeDep = timeDep;
    }

    public String getTimeDepTill() {
        return timeDepTill;
    }

    public void setTimeDepTill(String timeDepTill) {
        this.timeDepTill = timeDepTill;
    }

    public String getAnotherEc() {
        return anotherEc;
    }

    public void setAnotherEc(String anotherEc) {
        this.anotherEc = anotherEc;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
