package com.shenhu.hotel.service.impl;

import com.shenhu.hotel.entity.Hotel;
import com.shenhu.hotel.repository.HotelRepository;
import com.shenhu.hotel.service.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getHotelList() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findHotelById(long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public void save(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void edit(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void delete(long id) {
        hotelRepository.deleteById(id);
    }
}


