package Week5;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		
		//The test driver. Takes a users input and invokes the reverse string method on that input.
		Scanner userIn = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String input = userIn.nextLine();
		
		System.out.print(reverseString(input));
		
		userIn.close();
	}
	
	public static String reverseString(String s) {
		//Tells the method to continue until the input string is empty
		if (s.isEmpty()) {
			return s;
		}
		//For each character in the input string, the method calls upon itself.
		//The string it uses as an input is it's own input string, with the first character shifted to the end of the string.
		return reverseString(s.substring(1)) + s.charAt(0);
	}
}
