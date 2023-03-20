package vcc;
/* Program to find max elements from array
 * -IV-
 * */

import java.util.Scanner;

public class MaxEelement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num=new int[] {11,20,31,44,47,99,74,888,19,567};
		int max=num[0];
		System.out.print("Array elements: ");
		for (int i = 0; i < num.length; i++) 
		{
			
			System.out.print(+num[i] + ", ");
		}
		System.out.println();
		for (int i = 1; i < num.length; i++) 
		{
			if(num[i]>max)
			{
				max=num[i];
				
			}
			
		}
		System.out.print("Max element in the array: "+max);

	}

}
