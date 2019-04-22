package com.shenhu.ticket.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shenhu.ticket.entity.Ticket;
import com.shenhu.ticket.service.TicketService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TicketController {

    @Resource
    TicketService ticketService;


    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Ticket> tickets= ticketService.getTicketList();
        model.addAttribute("tickets", tickets);
        return "ticket/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "ticket/ticketAdd";
    }

    @RequestMapping("/add")
    public String add(Ticket ticket) {
        ticketService.save(ticket);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        Ticket ticket= ticketService.findTicketById(id);
        model.addAttribute("ticket", ticket);
        return "ticket/ticketEdit";
    }

    @RequestMapping("/edit")
    public String edit(Ticket ticket) {
        ticketService.edit(ticket);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        ticketService.delete(id);
        return "redirect:/list";
    }
}
