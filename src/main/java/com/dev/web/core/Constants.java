package com.dev.web.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cosxt on 10/26/2017.
 */
public class Constants {
    
    private Constants() {}

    public static final String LVIV = "Львов";
    public static final String LVIV_ID = "2218000";
    public static final String KYIV = "Киев";
    public static final String KOVEL = "Ковель";
    public static final String KOVEL_ID = "2200184";
    public static final String IF_ID = "2218000";
    public static final String KYIV_ID = "2200001";
    public static final String RIVNE = "Ровно";
    public static final String RIVNE_ID = "2218400";
    public static final String DATE_DEP = "2019-04-26";
    public static final String TRAIN = "705Л";
    public static final String TRAIN_705L = "705Л";
    public static final String TRAIN_743K = "743К";
    public static final String TRAIN_743Л = "743Л";
    public static final String TRAIN_743Ш = "743Ш";
    public static final String TRAIN_098Л = "098Л";
    public static final String TRAIN_097K = "097К";
    public static final String TRAIN_804Л = "804Л";
    public static final String TRAIN_804Ш = "804Ш";
    public static final String TRAIN_371Ф = "371Ф";
    public static final String TRAIN_043K = "043К";

    public static final String TRAIN_806Ш = "806Ш";
    public static final String CLASS = "П";
    public static final String CLASS_2 = "K";
    public static final String CLASS_IC_C2 = "С2";

    public static List<String> TRAINS = new ArrayList<>();

    static {
        TRAINS.add(TRAIN_743K);TRAINS.add(TRAIN_743Ш);TRAINS.add(TRAIN_743Л);
    }
}
