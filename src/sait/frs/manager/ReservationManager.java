package sait.frs .manager;

import java.io.*;
import java.util.*;
import sait.frs.problemdomain.*;

public class ReservationManager {
	private ArrayList<Reservation> reservations;

	/**
	 * @param reservations
	 * @throws IOException 
	 */
	public ReservationManager() throws IOException {
		populate();
	}
	
	public Reservation makeReservation (Flight flight, String name, String citizenship) {
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
	
	public ArrayList<Reservation> findReservations (String code, String airline, String name) {
		
		return null;
	}
	
	public Reservation findReservationByCode (String code) {
		
		return null;
	}
	
	public void persist() throws IOException {
		RandomAccessFile raf = new RandomAccessFile ("res/reservations.dat", "rw");
		reservations.forEach( (r) -> {
				try {
					raf.writeBoolean(r.isActive());
					raf.writeUTF(r.getCitizenship());
					raf.writeUTF(r.getCode());
					raf.writeUTF(r.getFlightCode());
					raf.writeUTF(r.getName());
					raf.writeUTF(r.getAirline());
					raf.writeDouble(r.getCost());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
		raf.close();
	}

	private int getAvailableSeats (Flight flight) {
		return flight.getSeats();
	}	
	
	private String generateResevationCode (Flight flight) {
		String generatedCode = ( ( flight.isDometic() ) ? "D" : "L" ) + new Random().nextInt(9000) + 1000;
		boolean flag = true;
		while ( flag ) {
			flag = false;
			for( Reservation r : reservations ) {
				if ( r.getCode() == generatedCode ) flag = true;
			}
			if ( flag ) generatedCode = ( ( flight.isDometic() ) ? "D" : "L" ) + new Random().nextInt(9000) + 1000;
		}
		return generatedCode;
	}

	private void populate() throws IOException {
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
	}

}	
