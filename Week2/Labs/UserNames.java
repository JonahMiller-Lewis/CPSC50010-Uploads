package Week2;

import java.util.Random;

public class UserNames {
	public static void main(String[] args) {
		
		//Initialize the names
		String firstName = "Johnathan";
		String lastName = "Carpenter";
		
		//Creates a random number generator which is inclusive between 0 and 89
		//The assignment asks for a random number between 10 and 99, so 10 is added to the generated number
		//to adjust for the alternative minimum
		Random numberGen = new Random();
		int random = 10 + numberGen.nextInt(89);
		
		//Uses substring to get the first four letters of the last name, the first
		//letter of the first name, and the randomly generated number
		//spaces have also been added for readability
		System.out.println(lastName.substring(0,4) + 
							" " + firstName.substring(0,1) + " " + random );
	}
}
