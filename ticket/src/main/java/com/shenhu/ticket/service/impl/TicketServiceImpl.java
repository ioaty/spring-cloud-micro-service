package com.shenhu.ticket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.shenhu.ticket.entity.Ticket;
import com.shenhu.ticket.repository.TicketRepository;
import com.shenhu.ticket.service.TicketService;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getTicketList() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findTicketById(long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void edit(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void delete(long id) {
        ticketRepository.deleteById(id);
    }
}


