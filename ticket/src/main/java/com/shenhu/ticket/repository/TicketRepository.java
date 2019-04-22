package com.shenhu.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shenhu.ticket.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    Ticket findById(long id);

    void deleteById(Long id);
}