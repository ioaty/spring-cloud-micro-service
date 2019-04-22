package com.shenhu.consume.service.hystric;

import com.shenhu.consume.entity.Ticket;
import com.shenhu.consume.service.TicketService;
import org.springframework.stereotype.Component;

@Component
public class TicketServiceHystric implements TicketService {
    @Override
    public Object getAllTicket(){
        return "failed to get tickets";
    }

    @Override
    public String addTicket(Ticket ticket){
        return "ticket add failed";
    }
}
