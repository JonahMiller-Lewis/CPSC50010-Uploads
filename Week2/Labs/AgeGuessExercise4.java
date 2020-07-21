package Week2;
import java.util.Scanner;
import java.util.Random;

public class AgeGuessExercise4 {
	
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
		
		if (ageGuess != age) {
			System.out.println("You guessed wrong!");
			
			//if the ageGuess is lower than the actual age, say that the age is "Older"
			if (ageGuess < age) {
				System.out.println("Older");
			}
			
			//if the ageGuess is higher than the actual age, say that the age is "Younger"
			if (ageGuess > age) {
				System.out.println("Younger");
			}
		}
		
		//Tell the user if they guessed correctly
		else {
			
			System.out.println("You guessed correctly! " + name + "'s age is: " + age);
		}
	}
}