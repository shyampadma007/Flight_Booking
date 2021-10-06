package com.project.flight.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.flight.entity.FlightBookingEntity;
import com.project.flight.service.FlightBookingService;

@RestController
@RequestMapping("/admin")
public class FlightBookingController {

	@Autowired
	FlightBookingService flightservice;
	
	@PostMapping("/flightSave")  
	private long save(@RequestBody FlightBookingEntity flight)   
	{  
		flightservice.saveOrUpdate(flight);  
	    return flight.getFlightid();  
	} 
	
	@PutMapping("/flightBookingUpdated/{flightid}")
	private ResponseEntity<FlightBookingEntity> flightupdate(@PathVariable("flightid") long flightid,@RequestBody FlightBookingEntity flight) 
	{
		System.out.println("Print Booking");
		return new ResponseEntity<FlightBookingEntity>(flightservice.updateFlightBooking(flight,flightid),HttpStatus.OK);
	}
	
	
}
