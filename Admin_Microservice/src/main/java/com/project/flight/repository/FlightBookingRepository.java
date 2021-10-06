package com.project.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.flight.entity.FlightBookingEntity;

public interface FlightBookingRepository extends JpaRepository<FlightBookingEntity, Long>{

}
