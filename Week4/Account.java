package Week4;

public class Account {

	//creates the static numAccounts int, and the constructor method which adds one to numAccount for each Account class created
	static int numAccounts = 0;	
	Account(){
		numAccounts++;
	}
	
		public static void main(String[] args) {
			
			//creating some accounts
			Account first = new Account();
			Account second = new Account();
			Account third = new Account();
			
			getNumAccounts();
		}
		
	static void getNumAccounts() {
		
		System.out.println(numAccounts);
	}
}
