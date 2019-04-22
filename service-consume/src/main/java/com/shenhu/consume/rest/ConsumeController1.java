package com.shenhu.consume.rest;

import com.shenhu.consume.entity.Hotel;
import com.shenhu.consume.entity.HotelAndTicket;
import com.shenhu.consume.entity.Ticket;
import com.shenhu.consume.service.TicketService;
import com.shenhu.consume.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/comsume1")
public class ConsumeController1 {

    @Autowired
    HotelService hotelService;

    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Object test(){
        HotelAndTicket ht=new HotelAndTicket();

        List<Hotel> hotels=new ArrayList<Hotel>();
        List<Ticket> tickets=new ArrayList<Ticket>();
        Hotel h=new Hotel();
        h.setDtime("20180908");
        h.setHotelName("北京酒店");
        h.setRoom("标间");
        h.setPrice(1000.22);
        hotels.add(h);

        Hotel h1=new Hotel();
        h1.setDtime("20180908");
        h1.setHotelName("北京酒店1");
        h1.setRoom("标间1");
        h1.setPrice(1000.22);
        hotels.add(h1);

        Ticket t=new Ticket();
        t.setDtime("20180909");
        t.setFromWhere("深圳");
        t.setToWhere("贵阳");
        tickets.add(t);

        Ticket t1=new Ticket();
        t1.setDtime("20180909");
        t1.setFromWhere("深圳1");
        t1.setToWhere("贵阳1");
        tickets.add(t1);

        ht.setHotels(hotels);
        ht.setTickets(tickets);

        return ht;
    }

    @RequestMapping(value = "/hotel/all",method = RequestMethod.GET)
    public Object getAllHotel(){
        return hotelService.getAllHotel();
    }

    @RequestMapping(value = "/ticket/all",method = RequestMethod.GET)
    public Object getAllTicket(){
        return ticketService.getAllTicket();
    }

    @RequestMapping(value = "/addHotelAndTicket",method = RequestMethod.POST)
    public Object addHotelAndTicket(@RequestBody HotelAndTicket hotelAndTicket){
        if(hotelAndTicket!=null){
            List<Hotel> hotelList=hotelAndTicket.getHotels();
            hotelList.forEach(h->hotelService.addHotel(h));
            List<Ticket> ticketList=hotelAndTicket.getTickets();
            ticketList.forEach(t-> ticketService.addTicket(t));
        }

        List retList=new ArrayList();
        retList.add(hotelService.getAllHotel());
        retList.add(ticketService.getAllTicket());

        return retList;
    }
}