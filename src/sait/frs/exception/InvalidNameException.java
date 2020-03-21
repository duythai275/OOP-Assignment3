package sait.frs.exception;

/**
 * THis program demonstrates how InvalidName throws an exception 
 * when an name is missed
 * @author Thai Nguyen, Seulgi Kim, 
 * @version March 20, 2020
 */

public class InvalidNameException extends Exception {
	public InvalidNameException() {
		super("Name is missing");
	}
}
