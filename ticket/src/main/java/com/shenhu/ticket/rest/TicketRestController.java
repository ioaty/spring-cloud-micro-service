package com.shenhu.ticket.rest;

import org.springframework.web.bind.annotation.*;

import com.shenhu.ticket.entity.Ticket;
import com.shenhu.ticket.service.TicketService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TicketRestController extends BaseRestController{

    @Resource
    TicketService ticketService;

    @RequestMapping(value = "/rest/add", method = RequestMethod.POST)
    public String addTicket(@RequestBody Ticket ticket) throws Exception {
        ticketService.save(ticket);

        return "added sucessfully";
    }

    @RequestMapping(value = "/rest/all", method = RequestMethod.GET)
    public  Object getTickets() throws Exception {
        List<Ticket> tickets= ticketService.getTicketList();

        ReturnObject obj=new ReturnObject();
        obj.setObject(tickets);
        obj.setPort(getServerPort());

        return obj;
    }
}
