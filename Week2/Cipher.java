/*
 Name: Jonah Miller
 Course Name: Programming Fundamentals
 Semester: Summer 2020
 Assignment Name: Programming Assignment 1 (Cipher)
 */

package Week2;

import java.util.Random;
import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
	
		//Display identifier
		System.out.println("Programming Fundamentals Summer 2020");
		System.out.println("NAME: Jonah Miller");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();
		
		//Welcome message and ask for user to input numbers
		System.out.println("Welcome to the Cipher program");
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		//create a new scanner which will be used to allow the user to enter their input
		Scanner userInput = new Scanner(System.in);
		
		/* The following code uses the scanner to take user input as the first through fifth numbers.
		 * Each scan includes an if statement which will output an error and end the program if the entered number is not within range.
		 * The scanner is closed once the fifth number is input
		 */
		System.out.print("1st number: ");
		int firstNumber = userInput.nextInt();
		if (firstNumber < 0 ^ firstNumber > 19){
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		System.out.print("2nd number: ");
		int secondNumber = userInput.nextInt();
		if (secondNumber < 0 ^ secondNumber > 19){
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("3rd number: ");
		int thirdNumber = userInput.nextInt();
		if (thirdNumber < 0 ^ thirdNumber > 19){
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("4th number: ");
		int fourthNumber = userInput.nextInt();
		if (fourthNumber < 0 ^ fourthNumber > 19){
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("5th number: ");
		int fifthNumber = userInput.nextInt();
		if (fifthNumber < 0 ^ fifthNumber > 19){
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
	
		userInput.close();
		System.out.println();
		
		
		//Store the total sum of the inputs as an int. Outputs the value of the total
		int total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
		System.out.println("Total = " + total);
		
		//Creates a random generator which assigns a value to an int which represents the key.
		//Outputs the value of that key
		Random keyGen = new Random();
		int key = keyGen.nextInt(9);
		System.out.println("Your Random key is " + key);
		
		//Separates the tens and the ones place of the sum
		int tensPlace = total/10;
		int onesPlace = total%10;
		
		//encodes both the tens place and the ones place, then assigns a new int as the combination of the two
		tensPlace = ((tensPlace + key)%10)*10;
		onesPlace = (onesPlace + key)%10;
		int encodedNumber = tensPlace + onesPlace;
		
		//Because the encoded number should always be two digits, this if statement forces a 0 in front of any number less than 10
		if (encodedNumber < 10) {
			System.out.println("Your encoded number is " + 0 + encodedNumber);
		}
		else {
			System.out.println("Your encoded number is " + encodedNumber);
		}		
	}
}
