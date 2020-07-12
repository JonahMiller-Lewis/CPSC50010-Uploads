package Week1;

import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		
		//Declare a new scanner named input
		Scanner input = new Scanner(System.in);
		
		//Ask for the amount of seconds, then declare a new int and scan for user input to initialize it
		System.out.print("Please input the number of seconds: ");
		int inputSeconds = input.nextInt();
		
		//Declare a new int minutes, which is equal to the number of the input seconds divided by 60.
		int minutes = inputSeconds/60;
		
		//Declare a new int seconds, which is equal to the remainder of the input seconds divided by 60
		int seconds = inputSeconds%60;
		
		//Declare a new int hours, which is equal to the number of minutes divided by 60
		int hours = minutes/ 60;		
		//Convert minutes into the remainder of minutes/60
		minutes %= 60;
		
		//Close the scanner
		input.close();
		
		//Output the calculated time computation
		System.out.println(inputSeconds + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
	}

}
