package sait.frs.problemdomain;

import sait.frs.exception.*;

/**
 * This program is a class for identifying "Reservation" objects
 * 
 * @author Thai Nguyen, Seulgi Kim
 * @version March 20, 2020
 */

public class Reservation {
	
	/**
	 * Seven private instance fields
	 */
	private boolean active; //
	private String citizenship; //Citizenship of reservation
	private String code; //Code of reservation
	private String flightCode; //Flight code of reservation
	private String name; //Name of reservation
	private String airline; // airline of reservation
	private double cost; //Cost of reservation
	

	/**
	 * The constructor for the reservation class
	 * @param active The boolean value is The 
	 * @param citizenship The string value is The citizenship of reservation
	 * @param code The string value is The code of reservation
	 * @param flightCode The string value is The flight code of reservation
	 * @param name The string value is The name of reservation
	 * @param airline The string value is The airline of reservation
	 * @param cost The double value is The cost of reservation
	 */
	public Reservation(boolean active, String citizenship, String code, String flightCode, String name, String airline,
			double cost) {
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
	 * getCitizenship method is a getter of citizenship in Reservation class
	 * @return a value of citizenship attribute of a Reservation object
	 */
	public String getCitizenship() {
		return citizenship;
	}
	/**
	 * getCode method is a getter of code in Reservation class
	 * @return a value of code attribute of a Reservation object
	 */
	public String getCode() {
		return code;
	}
	/**
	 * getFlightCode method is a getter of flightCode in Reservation class
	 * @return a value of flightCode attribute of a Reservation object
	 */
	public String getFlightCode() {
		return flightCode;
	}
	/**
	 * getName method is a getter of name in Reservation class
	 * @return a value of name attribute of a Reservation object
	 */
	public String getName() {
		return name;
	}
	/**
	 * getCiAirline method is a getter of airline in Reservation class
	 * @return a value of airline attribute of a Reservation object
	 */
	public String getAirline() {
		return airline;
	}
	/**
	 * getCost method is a getter of cost in Reservation class
	 * @return a value of cost attribute of a Reservation object
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * setActive is a setter of active attribute in Reservation class
	 * @param active is a parameter in order to set a value for active attribute of a Reservation object
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * setCitizenship method throws exceptions when citizenship is missed
	 * @param citizenship the citizenship to set
	 * @throws InvalidCitizenshipException 
	 */
	public void setCitizenship(String citizenship) throws InvalidCitizenshipException {
		if ( citizenship == "" ) {
			throw new InvalidCitizenshipException();
		}
		this.citizenship = citizenship;
	}
	/**
	 * 	 * setNAme method throws exceptions when name is missed
	 * @param name the name to set
	 * @throws InvalidNameException 
	 */
	public void setName(String name) throws InvalidNameException {
		if ( name.equals("") ) {
			throw new InvalidNameException();
		} else this.name = name;
	}

	@Override
	public String toString() {
		return code;
	}
}
