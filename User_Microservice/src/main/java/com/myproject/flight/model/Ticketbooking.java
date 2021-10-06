package com.myproject.flight.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TicketBooking")
public class Ticketbooking {

	@Id
	@Column(name = "TicketId")
	private String ticket_id;
	private String flight_name;
	private String passenger_name;
	private String passenger_mail_id;
	private int no_of_seat_booked;
	private String gender;
	private String source;
	private String destination;
	private Date from_date;
	private String mealtype;
	private long pnr_number;
	private String ticket_status;
	
	public Ticketbooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getPassenger_mail_id() {
		return passenger_mail_id;
	}
	public void setPassenger_mail_id(String passenger_mail_id) {
		this.passenger_mail_id = passenger_mail_id;
	}
	public int getNo_of_seat_booked() {
		return no_of_seat_booked;
	}
	public void setNo_of_seat_booked(int no_of_seat_booked) {
		this.no_of_seat_booked = no_of_seat_booked;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public String getMealtype() {
		return mealtype;
	}
	public void setMealtype(String mealtype) {
		this.mealtype = mealtype;
	}
	public long getPnr_number() {
		return pnr_number;
	}
	public void setPnr_number(long pnr_number) {
		this.pnr_number = pnr_number;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}
	
	
	
	
}
