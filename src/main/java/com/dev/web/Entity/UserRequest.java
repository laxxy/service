package com.dev.web.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by cosxt on 9/20/2017.
 */
public class UserRequest {

    @JsonIgnore
    private String stationIdFrom;
    @JsonIgnore
    private String stationIdTo;
    private String station_from;
    private String station_till;
    private String dateDep;
    @JsonIgnore
    private String timeDep;
    @JsonIgnore
    private String timeDepTill;
    @JsonIgnore
    private String anotherEc;
    @JsonIgnore
    private String search;
    @JsonIgnore
    private String desiredTrain;
    @JsonIgnore
    private String desiredClass;

    public UserRequest() {}

    public UserRequest(String stationFrom, String stationTo) {
        this.station_from = stationFrom;
        this.station_till = stationTo;
    }

    public String getDesiredTrain() {
        return desiredTrain;
    }

    public void setDesiredTrain(String desiredTrain) {
        this.desiredTrain = desiredTrain;
    }

    public String getDesiredClass() {
        return desiredClass;
    }

    public void setDesiredClass(String desiredClass) {
        this.desiredClass = desiredClass;
    }

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

    public String getStation_from() {
        return station_from;
    }

    public void setStation_from(String station_from) {
        this.station_from = station_from;
    }

    public String getStation_till() {
        return station_till;
    }

    public void setStation_till(String station_till) {
        this.station_till = station_till;
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

    @Override
    public String toString() {
        return String.format("station_from=%s, station_till=%s, dateDep=%s", station_from, station_till, dateDep);
    }
}
