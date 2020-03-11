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
		this.populateFlights();
		this.populateAirports();
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
		Scanner data = new Scanner(new File("res/flights.csv"));
		String line = "";
		while (data.hasNextLine()) {
			line = data.nextLine();
			String columns[] = line.split(",");
//			this.flights.add(columns[0]);
		}
	}
	
	private void populateAirports() throws FileNotFoundException {
		Scanner data = new Scanner(new File("res/airport.csv"));
		String line = "";
		while (data.hasNextLine()) {
			line = data.nextLine();
			String columns[] = line.split(",");
			this.airports.add(columns[0]);
		}
	}
	
	
	
	
	
	
	
	
	

}
