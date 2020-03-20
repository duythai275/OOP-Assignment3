package sait.frs.manager;

import java.util.*;
import java.io.*;

import sait.frs.problemdomain.*;



public class FlightManager {

	public final String WEEKDAY_ANY = "Any";
	public final String WEEKDAY_SUNDAY = "Sunday";
	public final String WEEKDAY_MONDAY = "Monday";
	public final String WEEKDAY_TUESDAY = "Tuesday";
	public final String WEEKDAY_WEDNESDAY = "Wednesday";
	public final String WEEKDAY_THURSDAY = "Thursday";
	public final String WEEKDAY_FRIDAY = "Friday";
	public final String WEEKDAY_SATURDAY = "Saturday";
	private ArrayList<Flight> flights;
	private ArrayList<String> airports;
	
	/**
	 * @param flights
	 * @param airports
	 */
	public FlightManager() {
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
		String res = "";
		try {
			Scanner data = new Scanner(new FileInputStream("res/airports.csv"), "UTF-8");
			String line = "";
			while (data.hasNextLine()) {
				line = data.nextLine();
				String columns[] = line.split(",");
				if ( columns[0].equals(code) ) {
					res = columns[1];
				}
			}
			data.close();
		} catch ( FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return res;
	}
	
	public Flight findFlightByCode(String code) {
		for ( Flight f : this.flights) {
			if ( f.getCode().equals(code) ) return f;
		}
		return null;
	}
	
	public ArrayList<Flight> findFlights(String from, String to, String weekday) {
		ArrayList<Flight> filteredFlights = new ArrayList<Flight> ();
		this.flights.forEach( f -> {
			if ( f.getFrom().equals(from) && f.getTo().equals(to) ) {
				if ( weekday.equals(WEEKDAY_ANY) ) filteredFlights.add(f);
				else {
					if ( f.getWeekday().equals(weekday) ) filteredFlights.add(f);
				}
			}
		});
		return filteredFlights;
	}
	
	private void populateFlights() {
		try {
			Scanner data = new Scanner(new FileInputStream("res/flights.csv"), "UTF-8");
			String line = "";
			while (data.hasNextLine()) {
				line = data.nextLine();
				String columns[] = line.split(",");
				if ( columns[0].matches("OA-\\d{4}") || columns[0].matches("CA-\\d{4}") || columns[0].matches("TB-\\d{4}") || columns[0].matches("VA-\\d{4}") ) {
					this.flights.add(new Flight(
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
		catch ( FileNotFoundException e ) {
			System.out.println(e.getMessage());
		}
	}
	
	private void populateAirports() {
		try {
			Scanner data = new Scanner(new FileInputStream("res/airports.csv"), "UTF-8");
			String line = "";
			while (data.hasNextLine()) {
				line = data.nextLine();
				String columns[] = line.split(",");
				this.airports.add(columns[0]);
			}
			data.close();
		}
		catch ( FileNotFoundException e ) {
			System.out.println(e.getMessage());
		}
	}
}
