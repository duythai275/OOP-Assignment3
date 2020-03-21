package sait.frs .manager;

import sait.frs.exception.*;

import java.io.*;
import java.util.*;
import sait.frs.problemdomain.*;

/**
 * This program make and find a reservation by code, airline, and name 
 * @author Thai Nguyen, Seulgi Kim, 
 * @version March 20, 2020
 */

public class ReservationManager {
	private ArrayList<Reservation> reservations;

	/**
	 * Constructor
	 * @param reservations
	 * @throws IOException 
	 */
	public ReservationManager() {
		reservations = new ArrayList<Reservation> ();
		populate();
	}
	
	public ArrayList<Reservation> getReservations() {
		return this.reservations;
	}
	
	public Reservation makeReservation (Flight flight, String name, String citizenship) throws NullFlightException, InvalidNameException, InvalidCitizenshipException, NoMoreSeatsException {
		if ( flight == null ) {
			throw new NullFlightException();
		} else if ( name.equals("") ) {
			throw new InvalidNameException();
		} else if ( citizenship.equals("") ) {
			throw new InvalidCitizenshipException();
		} else if ( getAvailableSeats(flight) == 0 ) {
			throw new NoMoreSeatsException();
		} else {
			Reservation r = new Reservation(
					true, 
					citizenship, 
					generateResevationCode(flight), 
					flight.getCode(), 
					name, 
					flight.getAirlineName(), 
					flight.getCostPerSeat()
			);
			reservations.add(r);
			return r;
		}
	}
	
	public ArrayList<Reservation> findReservations (String code, String airline, String name) {
		ArrayList<Reservation> filteredReservations = new ArrayList<Reservation> ();
		for ( Reservation r : this.reservations ) {
			if ( (code.equals("") || r.getCode().equals(code))
					&& (airline.equals("") || r.getAirline().equals(airline))
					&& (name.equals("") || r.getName().equals(name))
					&& (!code.equals("") || !airline.equals("") || !name.equals(""))
				) 
				filteredReservations.add(r);
		}
		return filteredReservations;
	}
	
	public Reservation findReservationByCode (String code) {
		for ( Reservation r : this.reservations) {
			if ( r.getCode().equals(code) ) return r;
		}
		return null;
	}
	
	public void persist() {
		try {
			RandomAccessFile raf = new RandomAccessFile ("res/reservations.dat", "rw");
			for ( Reservation r : reservations ) {
						raf.writeBoolean(r.isActive());
						raf.writeUTF(r.getCitizenship());
						raf.writeUTF(r.getCode());
						raf.writeUTF(r.getFlightCode());
						raf.writeUTF(r.getName());
						raf.writeUTF(r.getAirline());
						raf.writeDouble(r.getCost());
			};
			raf.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private int getAvailableSeats (Flight flight) {
		return flight.getSeats();
	}	
	
	private String generateResevationCode (Flight flight) {
		String generatedCode = ( ( flight.isDometic() ) ? "D" : "L" ) + (new Random().nextInt(9000) + 1000);
		boolean flag = true;
		while ( flag ) {
			flag = false;
			for( Reservation r : reservations ) {
				if ( r.getCode() == generatedCode && r.isActive() ) flag = true;
			}
			if ( flag ) generatedCode = ( ( flight.isDometic() ) ? "D" : "L" ) + new Random().nextInt(9000) + 1000;
		}
		return generatedCode;
	}

	private void populate() {
		
		try {
			RandomAccessFile raf = new RandomAccessFile ("res/reservations.dat", "rw");
			while ( raf.getFilePointer() < raf.length() ) {
				this.reservations.add( new Reservation(
					raf.readBoolean(),
					raf.readUTF(),
					raf.readUTF(),
					raf.readUTF(),
					raf.readUTF(),
					raf.readUTF(),
					raf.readDouble()
				));
			}
			raf.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}	
