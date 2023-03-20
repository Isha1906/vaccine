package vcc;
/*Program to print word instead of number with each case scenario
 * -IV-
 * */

import interf.A;

public class FizzBuzz implements A{

	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 3 == 0 && i % 5 == 0)  // if number is divisible by both 3 and 5 then "FizzBuzz"
			{
				System.out.println(" FizzBuzz");
			}
			else if (i % 5 == 0)   // if number is divisible by both 5 then "Buzz"
			{
				System.out.println(" Buzz");
			}
			else if (i % 3 == 0 )  // if number is divisible by both 3 then "Fizz"
			{
				System.out.println(" Fizz");
			}
			else {
				System.out.println(i);	
			}
			
			
		}
		
	}

	@Override
	public void net() {
		// TODO Auto-generated method stub
		
	}

}
