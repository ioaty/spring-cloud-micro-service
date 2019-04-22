package com.shenhu.hotel.rest;

import com.shenhu.hotel.entity.Hotel;
import com.shenhu.hotel.service.HotelService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HotelRestController extends BaseRestController{

    @Resource
    HotelService hotelService;

    @RequestMapping(value = "/rest/add", method = RequestMethod.POST)
    public String addHotel(@RequestBody Hotel hotel) throws Exception {
        hotelService.save(hotel);

        return "added sucessfully";
    }


    @RequestMapping(value = "/rest/all", method = RequestMethod.GET)
    public Object getHotels() throws Exception {
        List<Hotel> hotels= hotelService.getHotelList();

        ReturnObject obj=new ReturnObject();
        obj.setObject(hotels);
        obj.setPort(getServerPort());

        return obj;
    }
}
