package sait.frs.problemdomain;

/**
 * This program is a class for identifying "Flight" objects
 * 
 * @author Thai Nguyen, Seulgi Kim
 * @version March 20, 2020
 */

public class Flight {
	
	/**
	 * Eight private instance fields
	 */
	private String airlineName; //Name of flight
	private String code; //Code of flight
	private double costPerSeat; //Seat cost of flight
	private String from; //origin of flight
	private int seats; //Seat of flight
	private String time; //Time of flight
	private String to; //Destination of flight
	private String weekday; //Days of flight
	
	
	/**
	 * The constructor for the flight class
	 * @param code The string value is The code of the flight
	 * @param costPerSeat The double value is The seat cost of the flight
	 * @param from The string value is The origin of the flight
 	 * @param seats The integer value is The seats of the flight
	 * @param time The string value is The time of the flight
	 * @param to The string value is The destination of the flight
	 * @param weekday The string value is The days of the flight
	 */
	public Flight(String code, double costPerSeat, String from, int seats, String time, String to,
			String weekday) {
		this.code = code;
		this.costPerSeat = costPerSeat;
		this.from = from;
		this.seats = seats;
		this.time = time;
		this.to = to;
		this.weekday = weekday;
		parseCode(code);
	}
	/**
	 * getAirlineName method is a getter of airlineName in flight class
	 * @return a value of airlineName attribute of a flight object
	 */
	public String getAirlineName() {
		return airlineName;
	}
	/**
	 * getCode method is a getter of code in flight class
	 * @return a value of code attribute of a flight object
	 */
	public String getCode() {
		return code;
	}
	/**
	 * getCostPerSeat method is a getter of costPerSeat in flight class
	 * @return a value of costPerSeat attribute of a flight object
	 */
	public double getCostPerSeat() {
		return costPerSeat;
	}
	/**
	 * getFrom method is a getter of from in flight class
	 * @return a value of from attribute of a flight object
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * getSeats method is a getter of seats in flight class
	 * @return a value of seats attribute of a flight object
	 */
	public int getSeats() {
		return seats;
	}
	/**
	 * getTime method is a getter of time in flight class
	 * @return a value of time attribute of a flight object
	 */
	public String getTime() {
		return time;
	}
	/**
	 * getTo method is a getter of to in flight class
	 * @return a value of to attribute of a flight object
	 */
	public String getTo() {
		return to;
	}
	/**
	 * getWeekday method is a getter of weekday in flight class
	 * @return a value of weekday attribute of a flight object
	 */
	public String getWeekday() {
		return weekday;
	}
	/**
	 * The Domestic method checks whether the airport is domestic or not
	 * @return true if the airport is domestic
	 */
	public boolean isDometic() {
		if ( this.from.charAt(0) == 'Y' && this.to.charAt(0) == 'Y' ) return true;
		else return false;
	}
	
	/**
	 * The parseCode method assigns airline name by its code
	 */
	private void parseCode(String code) {
		if ( code == "OA" ) this.airlineName = "Otto Airlines";
		else if ( code == "CA" ) this.airlineName = "Conned Air";
		else if ( code == "TB") this.airlineName = "Try a Bus Airways";
		else this.airlineName = "Vertical Airways";
	}

	@Override
	public String toString() {
		return code + ", From: " + from + ", To: "+ to + ", Day: " + weekday + ", Cost: " + costPerSeat;
	}
}
