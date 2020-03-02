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

    public String getCode() {
        return code;
    }

    public int getMarketId() {
        return marketId;
    }

    public int getSectorId() {
        return sectorId;
    }

    public String getName() {
        return name;
    }

    public String getCaetgory() {
        return caetgory;
    }

    public Float getOpen() {
        return open;
    }

    public Float getHigh() {
        return high;
    }

    public Float getLow() {
        return low;
    }

    public Float getClose() {
        return close;
    }

    public Float getYcp() {
        return ycp;
    }

    public int getTrades() {
        return trades;
    }

    public int getVolume() {
        return volume;
    }

    public Float getValue() {
        return value;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCaetgory(String caetgory) {
        this.caetgory = caetgory;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public void setYcp(Float ycp) {
        this.ycp = ycp;
    }

    public void setTrades(int trades) {
        this.trades = trades;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instrument(String code, int marketId, int sectorId, String name, String caetgory, Float open, Float high, Float low, Float close, Float ycp, int trades, int volume, Float value, String updatedAt, int id) {
        this.code = code;
        this.marketId = marketId;
        this.sectorId = sectorId;
        this.name = name;
        this.caetgory = caetgory;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.ycp = ycp;
        this.trades = trades;
        this.volume = volume;
        this.value = value;
        this.updatedAt = updatedAt;
        this.id = id;
    }
}
