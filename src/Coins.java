
public class Coins {

	static int[] coins_val = new int[]{1,2,5,10,25,50}; //array with coins values.
	
	public static int count (int sum,int coins_num)

	{    
		if (sum < 0  || coins_num<0) return 0;  // return 0 if amount of money or coins values ended. 
		if(sum == 0 || coins_num == 0 ) return 1; // return 1 when we got our amount from coins.
		return count(sum,coins_num-1) + count(sum-coins_val[coins_num],coins_num); 
		/*
		 recursion that calculates total number of variants to give change
		 By substracting coins values started of the highest from amount of money
		 until amount of money or coins of values ends.
		 */

	}
	public static int calc_coins (int sum)
	{    
		return count(sum,coins_val.length-1); //wrap method to avoid using extra parameter in Main (coins number)
											   //instead user enters only one parameter amount of money he has.
	}



}
