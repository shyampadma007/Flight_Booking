package com.project.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.flight.entity.FlightBookingEntity;
import com.project.flight.repository.FlightBookingRepository;

@Service
public class FlightBookingService {
	
	@Autowired
	public FlightBookingRepository flightrepo;
	
	public void saveOrUpdate(FlightBookingEntity flight) 
	{
		System.out.println("Updating");
		flightrepo.save(flight);
	}
	
	public FlightBookingEntity updateFlightBooking(FlightBookingEntity flight, long id) {
		// We need to check whether student id is exist or not
		System.out.println("update -> " + id);
		System.out.println(flight.toString());
		FlightBookingEntity existBooking = flightrepo.findById(id).orElse(null);
		existBooking.setFlightname(flight.getFlightname());
		existBooking.setFrom_place(flight.getFrom_place());
		existBooking.setFrom_date(flight.getFrom_date());
		existBooking.setFlight_status(flight.getFlight_status());
		existBooking.setMealtype(flight.getMealtype());
		existBooking.setNo_of_seat_available(flight.getNo_of_seat_available());
		existBooking.setNo_of_seats(flight.getNo_of_seats());
		existBooking.setPrice(flight.getPrice());
		existBooking.setTo_date(flight.getTo_date());
		existBooking.setFrom_date(flight.getFrom_date());
		return existBooking;
	}
	
}
