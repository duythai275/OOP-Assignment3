package sait.frs.manager;

import java.util.*;
import java.io.*;

import sait.frs.problemdomain.*;



public class FlightManager {

	public final String WEEKDAY_ANY = "Any";
	public final String WEEKDAY_SUNDAY = "Sunday";
	public final String WEEKDAY_MONDAY = "Monday";
	public final String WEEKDAT_Tuesday = "Thuesday";
	public final String WEEKDAT_WEDNESDAY = "Wednesday";
	public final String WEEKDAT_THURSDAY = "Thursday";
	public final String WEEKDAT_FRIDAY = "Friday";
	public final String WEEKDAT_SATURDAY = "Saturday";
	private ArrayList<Flight> flights;
	private ArrayList<String> airports;
	
	/**
	 * @param flights
	 * @param airports
	 * @throws FileNotFoundException 
	 */
	public FlightManager() throws FileNotFoundException {
		this.airports = new ArrayList<String> ();
		this.populateAirports();
		
		this.flights = new ArrayList<Flight> ();
		this.populateFlights();
	}

	/**
	 * @return the flights
	 */
	public ArrayList<Flight> getFlights() {
		return flights;
	}

	/**
	 * @return the airports
	 */
	public ArrayList<String> getAirports() {
		return airports;
	}

	public String findAirportByCode(String code) {
		return "";
	}
	
	public Flight findFlightByCode(String code) {
		return null;
		
	}
	
	public ArrayList<Flight> findFlight(String from, String to, String weekday) {
		return null;
	}
	
	private void populateFlights() throws FileNotFoundException {
		Scanner data = new Scanner(new FileInputStream("res/flights.csv"), "UTF-8");
		String line = "";
		while (data.hasNextLine()) {
			line = data.nextLine();
			String columns[] = line.split(",");
			if ( columns[0].matches("OA-\\d{4}") || columns[0].matches("CA-\\d{4}") || columns[0].matches("TB-\\d{4}") || columns[0].matches("VA-\\d{4}") ) {
				this.flights.add(new Flight(
					(columns[0].substring(0,2) == "OA") ? "Otto Airlines" : (columns[0].substring(0,2) == "CA") ? "Conned Air" : (columns[0].substring(0,2) == "TB") ? "Try a Bus Airways" : "Vertical Airways",
					columns[0],
					Double.parseDouble(columns[6]),
					columns[1],
					Integer.parseInt(columns[5]),
					columns[4],
					columns[2],
					columns[3]
				));
			}
		}
		data.close();
	}
	
	private void populateAirports() throws FileNotFoundException {
		Scanner data = new Scanner(new FileInputStream("res/airports.csv"), "UTF-8");
		String line = "";
		while (data.hasNextLine()) {
			line = data.nextLine();
			String columns[] = line.split(",");
			this.airports.add(columns[0]);
		}
		data.close();
	}
	
	
	
	
	
	
	
	
	

}
