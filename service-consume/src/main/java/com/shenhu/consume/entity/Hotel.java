package com.shenhu.consume.entity;


public class Hotel {

    private long id;
    private String hotelName;
    private String room;
    private double price;
    private String dtime;
    private int userId;

    public long getId() {
        return id;
    }

    public Hotel setId(long id) {
        this.id = id;
        return this;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
