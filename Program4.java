//Write a Java program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;

public class Program4
  {

	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 5 and 11 : ");
		number = sc.nextInt();	
		
		if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("\n Given number " + number + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 5 and 11"); 
		}	
	}
}