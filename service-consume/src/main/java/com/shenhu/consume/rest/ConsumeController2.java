package com.shenhu.consume.rest;

import com.shenhu.consume.service.HotelService;
import com.shenhu.consume.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/comsume2")
public class ConsumeController2 {

    @Autowired
    HotelService hotelService;

    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object getAll(){

        List retList=new ArrayList();
        retList.add(hotelService.getAllHotel());
        retList.add(ticketService.getAllTicket());

        return retList;
    }
}
