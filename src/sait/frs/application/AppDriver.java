package sait.frs.application;

import java.io.*;

import sait.frs.gui.MainWindow;
import sait.frs.manager.*;

/**
 * This program demonstrates a new Flight Reservation System. 
 * 
 * @author Thai Nguyen, Seulgi Kim
 * @version March 20, 2020
 */

public class AppDriver {
	
	/**
	 * Entry point to Java application.
	 * @param args an array of strings which stores arguments passed by command line while starting a program
	 */
	
	public static void main(String[] args) throws IOException {
		MainWindow mainWindow = new MainWindow();
		mainWindow.display();
	}
}
