package com.myproject.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.flight.model.Ticketbooking;

@Repository
public interface TicketRepository extends JpaRepository<Ticketbooking, String>{

}
