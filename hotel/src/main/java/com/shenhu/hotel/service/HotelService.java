package com.shenhu.hotel.service;

import java.util.List;

import com.shenhu.hotel.entity.Hotel;

public interface HotelService {

    public List<Hotel> getHotelList();

    public Hotel findHotelById(long id);

    public void save(Hotel hotel);

    public void edit(Hotel hotel);

    public void delete(long id);


}
