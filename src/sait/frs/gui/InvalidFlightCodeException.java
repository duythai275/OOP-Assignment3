package sait.frs.gui;

public class InvalidFlightCodeException extends Exception {
	InvalidFlightCodeException( String code ) {
		super("Code can not be empty");
	}
}
