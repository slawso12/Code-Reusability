package com.stephonlawson.helloworld;

import java.util.Scanner;

public class StudentHelper {
	@SuppressWarnings("resource")
	public static String ReadInputString(){
		// declare a new Scanner object
		Scanner scan = new Scanner(System.in);
		
		// read in user input and store it in the scanned variable
		String scanned = scan.nextLine();
		
		// return the result to wherever the "StudentHelper.ReadNextLine()" is called
		return scanned;
	}
	
	@SuppressWarnings("resource")
	public static int ReadInputInt() {
		Scanner scan = new Scanner(System.in);
		
		int scanned = scan.nextInt();
		
		return scanned;
		
	}
}