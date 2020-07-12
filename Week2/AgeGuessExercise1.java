package Week2;
import java.util.Scanner;
import java.util.Random;

public class AgeGuessExercise1 {
	
	public static void main(String[] args) {
		
		//Declare a new scanner named input
		Scanner input = new Scanner(System.in);
		
		//Declare the name and age variables to be input by the user
		String name;
		int ageGuess;
		
		//Ask for the name and scan for user input
		System.out.print("Please enter the name: ");
		name = input.next();
		
		//Ask for the age and save ageGuess as the next input int variable
		System.out.print("Please enter the age guess: ");
		ageGuess = input.nextInt();
		
		//close the scanner
		input.close();
		
		//a generator for the actual age, and the age it generates
		Random ageGen = new Random();
		int age = ageGen.nextInt(100);
		
		//Print the name and age guess that were entered
		System.out.println("You guessed that " + name + "'s age is: " + ageGuess + ".");
		System.out.println(name + "'s actual age is : " + age + ".");
	}
}