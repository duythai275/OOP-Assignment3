package sait.frs.problemdomain;

public class Flight {
	
	/**
	 * 
	 */
	private String airlineName;

	private String code;
	private double costPerSeat;
	private String from;
	private int seats;
	private String time;
	private String to;
	private String weekday;
	
	
	/**
	 * @param airline
	 * @param code
	 * @param costPerSeat
	 * @param from
	 * @param seats
	 * @param time
	 * @param to
	 * @param weekday
	 */
	public Flight(String airlineName, String code, double costPerSeat, String from, int seats, String time, String to,
			String weekday) {
		super();
		this.airlineName = airlineName;
		this.code = code;
		this.costPerSeat = costPerSeat;
		this.from = from;
		this.seats = seats;
		this.time = time;
		this.to = to;
		this.weekday = weekday;
	}
	/**
	 * @return the airline
	 */
	public String getAirlineName() {
		return airlineName;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the costPerSeat
	 */
	public double getCostPerSeat() {
		return costPerSeat;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @return the weekday
	 */
	public String getWeekday() {
		return weekday;
	}
	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public boolean isDometic() {
		return true;
	}
	
	private String parseCode() {
		return "";
	}

	@Override
	public String toString() {
		return "Flight [airlineName=" + airlineName + ", code=" + code + ", costPerSeat=" + costPerSeat + ", from="
				+ from + ", seats=" + seats + ", time=" + time + ", to=" + to + ", weekday=" + weekday + "]";
	}
}
