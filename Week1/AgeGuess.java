package Week1;

import java.util.Scanner;

public class AgeGuess {
	
	public static void main(String[] args) {
		
		//Declare a new scanner named input
		Scanner input = new Scanner(System.in);
		
		//Declare the name and age variables to be input by the user
		String name;
		int ageGuess;
		
		//Ask for the name and scan for user input
		System.out.print("Please enter the name: ");
		name = input.next();
		
		//Ask for the age and scan for user input
		System.out.print("Please enter the age guess: ");
		ageGuess = input.nextInt();
		
		//close the scanner
		input.close();
		
		//Print the name and age guess that were entered
		System.out.println("The name is " + name + " and the age guess is " + ageGuess);
	}
	
}
