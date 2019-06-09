package fun.consus.vita;

import java.util.Scanner;

public class Console {
	  public static void main(String[] args) {
		  	Scanner debugEnabler = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Do you want debug mode on (please note: if you dont say true it will default to false)?");

		    String debugOnOff = debugEnabler.nextLine();  // Read user input

	        boolean debugMode = Boolean.parseBoolean(debugOnOff);
	        System.out.println("Debug mode = " + debugMode);

	        if (debugMode) {
	        	System.out.println("Congrats you figured out the console n3");
	        } else {
	        	System.out.println("You know the game isn't playable yet, right?");
	        }
	    }
	}