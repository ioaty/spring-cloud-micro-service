package com.shenhu.consume.service.hystric;

import com.shenhu.consume.entity.Hotel;
import com.shenhu.consume.service.HotelService;
import org.springframework.stereotype.Component;

@Component
public class HotelServiceHystric implements HotelService {

    @Override
    public Object getAllHotel(){
        return "failed to get hotels";
    }

    @Override
    public String addHotel(Hotel hotel){
        return "hotel add failed";
    }
}
