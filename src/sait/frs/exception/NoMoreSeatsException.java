package sait.frs.exception;

/**
 * This program demonstrates how NoMoreSeats throws an exception 
 * when there is no more seats on the flight 
 * @author Thai Nguyen, Seulgi Kim, 
 * @version March 20, 2020
 */

public class NoMoreSeatsException extends Exception {
	public NoMoreSeatsException() {
		super("No more seats on this flight");
	}
}
