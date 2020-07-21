package Week3;

import java.util.Scanner;

public class EvenNumSum {
	

	public static void main(String[] args) {
		
		//create the scanner
		Scanner scan = new Scanner(System.in);
		
		//prompt for user input
		System.out.print("Please enter an integer that is greater than or equal to 2: ");
		
		//scan for user input
		int userInput = scan.nextInt();
		
		//this will keep looping until the user input is valid
		while (userInput <2) {
			System.out.print(userInput + " is not a valid number. Please enter an integer that is greater than or equal to 2: ");
			userInput = scan.nextInt();
		}
		
		//close the scanner
		scan.close();
		
		//this int represents the sum of the numbers which will be output
		int sum = 0;
		
		//this for loop looks at every number between 2 and the user input and uses the remainder function to only pick even numbers
		//it then adds even numbers to the sum
		for (int i = 2; i <= userInput; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		
		//this outputs the sum
		System.out.println("The sum of all even numbers between 2 and " + userInput + " is " + sum);
	}
}
