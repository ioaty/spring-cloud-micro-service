package com.shenhu.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shenhu.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Hotel findById(long id);

    void deleteById(long id);
}