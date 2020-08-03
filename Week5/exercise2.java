package Week5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class exercise2 {

		public static void main(String[] args) throws IOException{
			
			//Creates a scanner which will be used to take user input, and a filewWriter which will write to the txt file
			Scanner inputScanner = new Scanner(System.in);
			FileWriter fileWriter = new FileWriter("userStrings.txt");
			
			System.out.println("Please the string you would like to add to the file. Enter \"DONE\" to end the program.");
			String userInput = inputScanner.nextLine();
			
			//Loops while asking for user input, until the user enters DONE
			while (!userInput.equals("DONE")) {
				fileWriter.write(userInput);
				System.out.println("Please the string you would like to add to the file. Enter \"DONE\" to end the program.");
				userInput = inputScanner.nextLine();
			}
			
			//Close scanners
			inputScanner.close();
			fileWriter.close();
		}
}
