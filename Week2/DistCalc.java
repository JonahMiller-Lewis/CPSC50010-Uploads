package Week2;
import java.text.DecimalFormat;

public class DistCalc {
	public static void main(String[] args) {
		
		//This creates the decimal format which rounds to the nearest thousandth
		DecimalFormat thousandth = new DecimalFormat("#.###");
		
		//These are the variables used for the calculation.
		//I used floats because we want decimals in the final output.
		double x1 = 35.56;
		double y1 = 24.12;
		
		double x2 = 100.09;
		double y2 = 70.89;
		
		//Calculates the distance between the points.
		double distance = Math.sqrt((Math.pow(x2-x1, 2)) + Math.pow(y2-y1, 2));

		
		//This outputs the distance
		System.out.println(thousandth.format(distance));
	}
}
