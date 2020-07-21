package Week3;

public class Box {

	//the int variable size determines the height and width of the box
	int size = 0;
	
	public static void main(String[] args) {

		//initializes a new box, assigns its size, and calls the print box method
		Box box = new Box();
		box.size = 5;
		box.printBox();
		
	}
	
	//this method assigns the printed row and column size to be equal to the size of the box
	//it then uses a four loop to print a number of '*' characters equal to the number of columns, on a number of lines
	//equal to the number of rows. Note that the extra println function is to create the next row of the box
	
	public void printBox() {
		
		int rows = size;
		int columns = size;
		
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < columns; k++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}
}
