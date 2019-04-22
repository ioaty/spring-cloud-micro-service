package com.shenhu.ticket.service;

import java.util.List;

import com.shenhu.ticket.entity.Ticket;

public interface TicketService {

    public List<Ticket> getTicketList();

    public Ticket findTicketById(long id);

    public void save(Ticket ticket);

    public void edit(Ticket ticket);

    public void delete(long id);


}
