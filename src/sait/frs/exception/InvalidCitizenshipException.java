package sait.frs.exception;
	
/**
 * This Program demonstrates how InvalidCitizenship throws 
 * an exception when an citizenship is missed 
 * @author Thai Nguyen, Seulgi Kim, 
 * @version March 20, 2020
 */
	 
public class InvalidCitizenshipException extends Exception {
	public InvalidCitizenshipException() {
		super("Citizenship is missing");
	}
}
