package sait.frs.manager;

import java.util.*;
import sait.frs.problemdomain.*;

public class ReservationManager {
	private ArrayList<Reservation> reservations;

	/**
	 * @param reservations
	 */
	public ReservationManager() {
	}
	
	public Reservation makeReservation (Flight flight, String name, String citizenship) {
	
		return null;
	}
	
	public ArrayList<Reservation> findReservations (String code, String airline, String name) {
		
		return null;
	}
	
	public Reservation findReservationByCode (String code) {
		
		return null;
	}
	
	public void persist() {
		
	}

	private int getAvailableSeats (Flight flight) {
		
		return 0;
	}	
	
	private String generateResevationCode (Flight flight) {
		
		return "";
	}

	private void popultaeFromBinary() {
		
	}

}	
