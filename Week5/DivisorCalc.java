package Week5;

import java.util.Scanner;

public class DivisorCalc {

		public static void main(String[] args) {
			
			//This is the driver method, which takes user input, checks that both integers are greater than 0, and then outputs
			//the result of the gcd method of valid integers
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Please enter two integers that are greater than 0.");
			System.out.print("Integer 1: ");
			int num1 = userInput.nextInt();
			while (num1 <= 0) {
				System.out.println("\nIntegers must be greater than 0. Please enter a different integer.");
				System.out.print("Integer 1: ");
				num1 = userInput.nextInt();
			}
			
			System.out.print("\nInteger 2: ");
			int num2 = userInput.nextInt();
			while (num2 <= 0) {
				System.out.println("\nIntegers must be greater than 0. Please enter a different integer.");
				System.out.print("Integer 2: ");
				num2 = userInput.nextInt();
			}
			System.out.println("\nThe Greatest Common Demoninator of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
			
			userInput.close();
		}
		
		//This is the implementation of Euclid's algorithm as a recursive method.
		public static int gcd(int num1, int num2) {
			
			//This is the base case of the method.
			if (num2 <= num1 && (num1%num2) == 0) {
				return num2;
			}
			
			//If the base case is not met, the method will call itself until the base case is met.
			//This if statement will cause the method to always call itself with the smaller of the two integers.
			if (num1 < num2) {
				return gcd(num2, num1);
			}
			
			//This statement is what causes the method to continously check subproblems until the base case is met.
			else {
				return gcd(num2, num1%num2);
			}
				
			
		}
}
