package vcc;
/*Program to reverse a string
 * -IV-
 * */

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str1="";
		
		System.out.print("Enter a string: ");
		
		String str=sc.nextLine();
		
        for (int i = 0; i < str.length(); i++) 
        {
			str1=str.charAt(i)+str1;
			
		}
        
        System.out.println("Reversed string: "+str1);
        
		sc.close();
	}

}
