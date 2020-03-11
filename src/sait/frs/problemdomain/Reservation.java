package sait.frs.problemdomain;

public class Reservation {
	private boolean active;
	private String citizenship;
	private String code;
	private String flightCode;
	private String name;
	private String airline;
	private double cost;
	

	/**
	 * @param active
	 * @param citizenship
	 * @param code
	 * @param flightCode
	 * @param name
	 * @param airline
	 * @param cost
	 */
	public Reservation(boolean active, String citizenship, String code, String flightCode, String name, String airline,
			double cost) {
		super();
		this.active = active;
		this.citizenship = citizenship;
		this.code = code;
		this.flightCode = flightCode;
		this.name = name;
		this.airline = airline;
		this.cost = cost;
	}
	
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @return the citizenship
	 */
	public String getCitizenship() {
		return citizenship;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the flightCode
	 */
	public String getFlightCode() {
		return flightCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the airline
	 */
	public String getAirline() {
		return airline;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Reservation [active=" + active + ", citizenship=" + citizenship + ", code=" + code + ", flightCode="
				+ flightCode + ", name=" + name + ", airline=" + airline + ", cost=" + cost + "]";
	}
}
