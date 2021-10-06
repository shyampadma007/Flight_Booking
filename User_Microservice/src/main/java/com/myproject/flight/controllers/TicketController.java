package com.myproject.flight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.flight.model.Ticketbooking;
import com.myproject.flight.service.TicketService;

@RestController
@RequestMapping("/user/ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketser;

	@PostMapping("/ticketSave")  
	@CrossOrigin
	private String save(@RequestBody Ticketbooking ticket)   
	{  
		ticketser.saveorupdate(ticket);  
	    return ticket.getTicket_id();  
	}
	
	@GetMapping("/booking/List")
	@CrossOrigin
	private List<Ticketbooking> getListTicket()
	{
		return ticketser.getListTicket();
	}
	
	@GetMapping("/ticketbook/{ticetid}")
	@CrossOrigin
	private Ticketbooking getTicket(@PathVariable("ticket_id") String ticket_id) {
		return ticketser.getTicket(ticket_id);
	}
	
	@DeleteMapping("/ticketDelete/{ticketid}")
	@CrossOrigin
	private void deleteTicket(@PathVariable("ticket_id") String ticket_id) {
		ticketser.deleteTicket(ticket_id);
	}
}
