package com.shenhu.consume.service;

import com.shenhu.consume.entity.Hotel;
import com.shenhu.consume.service.hystric.HotelServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hotel",fallback = HotelServiceHystric.class)
public interface HotelService {

    @RequestMapping(value = "/rest/all",method = RequestMethod.GET)
    Object getAllHotel();

    @RequestMapping(value = "/rest/add",method = RequestMethod.POST)
    String addHotel(@RequestBody Hotel hotel);

}