package Week2;

public class FloatEqu {
	public static void main(String[] args) {
		
		//declare variables
		double first = (1.0/10)*(1.0/10);
		double second = (1.0/100);
		
		
		
		
		// Compare strict equality to see if they are exactly the same. If so, inform the user
		 if (first == second) {
			System.out.println("EQUAL");
		}
		else {
			
			//Compare variables within a reasonable amount of certainty
			//If they're approximately equal to each other, inform the user
			if (Math.abs(first - second) < 0.000001) {
				System.out.println("APPROXIMATELY EQUAL");
			}
			
			//If they aren't approximately equal to each other, inform the user
			else {
				System.out.println("NOT EQUAL");
			}
		}
		
	}
}
