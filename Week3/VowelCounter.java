package Week3;

import java.util.Scanner;

public class VowelCounter {
	
	public static void main(String[] args) {
		
		//ask for user input, create a scanner to find user input, and create a new string which contains that input
		System.out.print("Please eneter your string: ");
		Scanner input = new Scanner(System.in);
		String inputString = input.next();
		input.close();
		
		//these counts are used to tally the total amount of times that each vowel or non vowel is used
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int otherCount = 0;
		
		//this for loop goes through each character in the input string, then uses a switch statement to check if each letter
		//is a lower case vowel. The switch statement adds one to the tally of whichever letter is selected
		for(char c: inputString.toCharArray()) {
			
			switch(c) {
				case 'a':
					aCount++;
					break;
					
				case 'e':
					eCount++;
					break;
					
				case 'i':
					iCount++;
					break;
				
				case 'o':
					oCount++;
					break;
					
				case 'u':
					uCount++;
					break;
					
				default:
					otherCount++;
					break;
			}

		}
		
		//This outputs the total counts of all of the letters
		System.out.println("The number of a's in your string is: " + aCount);
		System.out.println("The number of e's in your string is: " + eCount);
		System.out.println("The number of i's in your string is: " + iCount);
		System.out.println("The number of o's in your string is: " + oCount);
		System.out.println("The number of u's in your string is: " + uCount);
		System.out.println("The number of letters which aren't lower case vowels in your string is: " + otherCount);
	}

}
