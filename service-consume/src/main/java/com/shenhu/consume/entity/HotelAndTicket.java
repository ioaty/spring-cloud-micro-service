package com.shenhu.consume.entity;

import java.util.List;
import java.util.Map;

public class HotelAndTicket {
    private List<Hotel> hotels;
    private  List<Ticket> tickets;

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
