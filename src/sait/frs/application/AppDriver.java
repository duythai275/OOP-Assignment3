package sait.frs.application;

import java.io.*;

import sait.frs.gui.MainWindow;
import sait.frs.manager.*;

public class AppDriver {
	public static void main(String[] args) throws IOException {
		MainWindow mainWindow = new MainWindow();
		mainWindow.display();
	}
}
