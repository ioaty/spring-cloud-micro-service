package com.shenhu.consume.entity;

public class Ticket {

    private long id;
    private String fromWhere;
    private String toWhere;
    private String dtime;
    private int userId;

    public long getId() {
        return id;
    }

    public Ticket setId(long id) {
        this.id = id;
        return this;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public String getToWhere() {
        return toWhere;
    }

    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
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
