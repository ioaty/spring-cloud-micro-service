package com.shenhu.consume.service;

import com.shenhu.consume.entity.Ticket;
import com.shenhu.consume.service.hystric.TicketServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-ticket",fallback = TicketServiceHystric.class)
public interface TicketService {
    @RequestMapping(value = "/rest/all",method = RequestMethod.GET)
    Object getAllTicket();

    @RequestMapping(value = "/rest/add",method = RequestMethod.POST)
    String addTicket(@RequestBody Ticket ticket);
}
