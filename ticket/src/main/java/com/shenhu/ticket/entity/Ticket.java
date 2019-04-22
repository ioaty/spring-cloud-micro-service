package com.shenhu.ticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String fromWhere;
    @Column(nullable = false)
    private String toWhere;
    @Column(nullable = false)
    private String dtime;

    @Column(nullable = false)
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
