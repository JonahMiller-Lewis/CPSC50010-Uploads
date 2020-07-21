package Week2;

import java.util.Scanner;

public class NumDisplay {
	public static void main(String[] args) {
			
		//Ask for user input
		System.out.print("Please enter a number between 0 and 9: ");
		
		//Create a new scanner which searches for the user's input, and assigns it to an int variable. Close the scanner after input.
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		userInput.close();
		
		//Begins the switch control, which evaluates the user input uses it to determine what to output. This includes a default for incorrect input
		switch (input) {		
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			default:
				System.out.println(input + " is an invalid number");
				break;
		}
		
	}
}
