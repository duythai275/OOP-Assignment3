package sait.frs.exception;

/**
 * This program demonstrates how NullFlight throws an exception 
 * when flight is missed
 * @author Thai Nguyen, Seulgi Kim, 
 * @version March 20, 2020
 */

public class NullFlightException extends Exception {
	public NullFlightException() {
		super("Flight is missing");
	}
}
