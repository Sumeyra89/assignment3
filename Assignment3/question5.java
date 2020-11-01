package Assignment3;

public class question5 {

	public static void main(String[] args) {
		
/*
 Question-5

Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds 
 */
		int hours=2;
		int minutes=15;
		int seconds=3;
	    
		int inputSecond=seconds+(minutes*60)+(hours*60)*60;
		System.out.println("inputSecond is " + inputSecond);
		System.out.println(hours + " hours, " +  minutes + " minutes, " +  seconds + " seconds ");
		
		
		
		
		
				
				
				
				
				
				
		
		
	}

}
