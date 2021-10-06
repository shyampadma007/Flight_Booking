package com.myproject.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.flight.model.Ticketbooking;
import com.myproject.flight.repository.TicketRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticrepo;
	
	public List<Ticketbooking> getListTicket(){
		List<Ticketbooking> ticket = new ArrayList<Ticketbooking>();
		ticrepo.findAll().forEach(ticketall -> ticket.add(ticketall));
		return ticket;
	}
	
	public Ticketbooking getTicket(String ticketid) {
		return ticrepo.findById(ticketid).get();
	}

	public void saveorupdate(Ticketbooking ticket) {
		ticrepo.save(ticket);
	}
	
	public void deleteTicket(String ticketid) {
		ticrepo.deleteById(ticketid);
		
	}
}
