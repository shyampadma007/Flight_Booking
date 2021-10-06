package com.project.flight.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightDetails")
public class FlightBookingEntity {

	@Id
	@GeneratedValue
	@Column(name="flightid", length =256, nullable = false,unique = true)
	private long flightid;
	@Column(name="flightname", length =256, nullable = false)
	private String flightname;
	@Column(name="from_place", length =256, nullable = false)
	private String from_place;
	@Column(name="to_place", length =256, nullable = false)
	private String to_place;
	@Column(name="from_date", length =256, nullable = false)
	private String from_date;
	@Column(name="to_date", length =256, nullable = false)
	private String to_date;
	@Column(name="no_of_seats", length =256, nullable = false)
	private int no_of_seats;
	@Column(name="price", length =256, nullable = false)
	private int price;
	public String getDiscount_code() {
		return discount_code;
	}
	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
	public int getDiscount_percentage() {
		return discount_percentage;
	}
	public void setDiscount_percentage(int discount_percentage) {
		this.discount_percentage = discount_percentage;
	}
	@Column(name="mealtype", length =256, nullable = false)
	private String mealtype;
	@Column(name="no_of_seat_available", length =256, nullable = false)
	private String no_of_seat_available;
	@Column(name="flight_status", length =256, nullable = false)
	private String flight_status;
	@Column(name="discount", length = 256, nullable = false)
	private String discount_code;
	
	private int discount_percentage;
	public long getFlightid() {
		return flightid;
	}
	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getFrom_place() {
		return from_place;
	}
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}
	public String getTo_place() {
		return to_place;
	}
	public void setTo_place(String to_place) {
		this.to_place = to_place;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMealtype() {
		return mealtype;
	}
	public void setMealtype(String mealtype) {
		this.mealtype = mealtype;
	}
	public String getNo_of_seat_available() {
		return no_of_seat_available;
	}
	public void setNo_of_seat_available(String no_of_seat_available) {
		this.no_of_seat_available = no_of_seat_available;
	}
	public String getFlight_status() {
		return flight_status;
	}
	public void setFlight_status(String flight_status) {
		this.flight_status = flight_status;
	}
	
	public FlightBookingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FlightBookingEntity [flightid=" + flightid + ", flightname=" + flightname + ", from_place=" + from_place
				+ ", to_place=" + to_place + ", from_date=" + from_date + ", to_date=" + to_date + ", no_of_seats="
				+ no_of_seats + ", price=" + price + ", mealtype=" + mealtype + ", no_of_seat_available="
				+ no_of_seat_available + ", flight_status=" + flight_status + "]";
	}
	
	
}
