package com.selim.stockbangladesh.models;

import com.google.gson.annotations.SerializedName;

public class Instrument {

    @SerializedName("code")
    private String code;

    @SerializedName("market_id")
    private int marketId;


    @SerializedName("sector_id")
    private int sectorId;

    @SerializedName("name")
    private String name;

    @SerializedName("category")
    private String caetgory;

    @SerializedName("open")
    private Float open;

    @SerializedName("high")
    private Float high;

    @SerializedName("low")
    private Float low;

    @SerializedName("close")
    private Float close;

    @SerializedName("yday_close")
    private Float ycp;

    @SerializedName("trades")
    private int trades;

    @SerializedName("volume")
    private int volume;

    @SerializedName("value")
    private Float value;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("id")
    private int id;





}
