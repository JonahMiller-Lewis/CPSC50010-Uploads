package Week5;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class exercise1 {
	public static void main(String[] args) throws FileNotFoundException{
		
		//Creates a new File named csv, and a scanner to find it by it's name. Then creates a scanner which will
		//scan through the file.
		String fileName = "input.csv";
		File csv = new File(fileName);
		Scanner fileScan = new Scanner(csv);
		
		//Prints the first line of the final output
		System.out.println("Maximum Values");
		
		//This will be used for the final output
		int row = 1;
		
		//This while loop iterates for each line within the csv file
		while (fileScan.hasNextLine()) {
			
			
			//Because each character in the csv file is interpreted by the scanner as a string variable, each line is first taken as String
			//The String.split method is then used to split this string into a string array with commas removed
			String input = fileScan.next();
			String[] inputSplit = input.split(",");
			
			//To calculate a maximum value of each line, we need the numbers to be taken as int variables
			//To do this, we first start 
			int[] inputToInt = new int[inputSplit.length];
			
			//This int variable will be used in the final output
			int max = 0;
			
			//This for loop uses the Integer.parseInt method to convert each string within the string array to an integer within the integer array
			//It also uses an if loop to find the maximum value of that int array
			for(int i = 0; i < inputSplit.length; i++) {
				
				inputToInt[i] = Integer.parseInt(inputSplit[i]);
				
				if (inputToInt[i] > max) {
					max = inputToInt[i];
				}
				
			}
			
			
			//This outputs the maximum value of a given line. The loop will then continue if there are more lines to be read
			System.out.println("ROW " + row + ": " + max);
			
			//Increases the row number for the next output
			row++;
		}
		
		//Closes the scanner
		fileScan.close();
	}
}
