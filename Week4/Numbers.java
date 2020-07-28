package Week4;

import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
		
		//declares an integer array and runs the next largest method
		int[] list = {17, 60, 45, 4, 99, 5};

		nextLargest(list);

	}
	
	public static void nextLargest(int[] list) {
		
		//creates a new int array that is a copy of the input array, then uses the imported util.Arrays to sort the 
		//new array from least to greatest
		int[] listAscending = new int[list.length];
		
		for (int i = 0; i < list.length; i++) {		
			listAscending[i] = list[i];
		}
		
		Arrays.sort(listAscending);
		
		//finds the largest number in the array
		int maxNumber = listAscending[listAscending.length - 1];
		
		//These nested loops compare each integer in the input list to each integer in the sorted list.
		//At the points where the arrays are equal, the system outputs the next greatest number as given in the sorted list.
		//If the numbers being compared are the previously determined maximum number, the max number is instead given.
		for (int i = 0; i < list.length; i++) {
			
			int nextNumber = 0;
			for (int j = 0; j < list.length - 1; j++) {

				if(listAscending[j] == list[i]) {
		
					nextNumber = listAscending[j + 1];					
					System.out.println(list[i] + ": " + nextNumber);
				}				
			}
			
				if(list[i] == maxNumber) {
					System.out.println(list[i] + ": " + maxNumber);
				}

			}
		
		}
	}