package sait.frs.exception;

public class NoMoreSeatsException extends Exception {
	public NoMoreSeatsException() {
		super("No more seats on this flight");
	}
}
