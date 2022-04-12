//Write a Java program to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
   // Percentage >= 90% : Grade A
   // Percentage >= 80% : Grade B
    //Percentage >= 70% : Grade C
    //Percentage >= 60% : Grade D
    //Percentage >= 40% : Grade E
    //Percentage < 40% : Grade F

import java.util.Scanner;

public class Program13 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, Percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();	
		
		total = english + chemistry + computers + physics + maths;
	    Percentage = (total / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
		if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
      else if(Percentage <= 40)
	    {
			System.out.println("\n Grade F");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	}
}
