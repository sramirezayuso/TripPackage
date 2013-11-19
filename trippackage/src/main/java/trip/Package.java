package trip;
import java.io.Serializable;


public class Package implements Serializable{
	public String flightId;
	public String hotelId;
	public String startDate;
	public String returnDate;
	public String destCountry;
	public String destCity;
	public String departureAirport;
	public String numPers;
	public String hotel;
	public String airline;
	public int flightPrice;
	public int hotelPrice;
	public int totalPrice;
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getNumPers() {
		return numPers;
	}
	public void setNumPers(String numPers) {
		this.numPers = numPers;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public int getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(String flightPrice) {
		this.flightPrice = Integer.parseInt(flightPrice);
		this.totalPrice = this.flightPrice + this.hotelPrice;
	}
	public int getHotelPrice() {
		return hotelPrice;
	}
	public void setHotelPrice(String hotelPrice) {
		this.hotelPrice = Integer.parseInt(hotelPrice);
	}
	
}
