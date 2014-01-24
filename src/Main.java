import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; // Amount of money
		boolean noerr = false; // true only when numbers entered and there was no exception.
		Scanner sn=new Scanner(System.in); // Scanner to read data from keyboard.
		System.out.println("Please enter amount of money"); //message for user
		do // loop for data entry until we get our amount of money
			try {
				sum=Integer.parseInt(sn.nextLine());//trying to get amount from entered data 
				noerr=true;                        //if it's not numbers there will be exception caught.
				sn.close();                        // System Scanner close operation to prevent resource leak.  
			}		        
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("incorrect data please enter number only ..."); // on exception caught program
			//sends message for user and then loop repeats.
		} while(noerr==false);

		System.out.println(Coins.calc_coins(sum)); // if everything successful Coins class method called.
	}

}
