//Write a Java program to find frequency of each digit in a given integer.

import java.util.Scanner;
 
public class Program33
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking inputNumber from the user
         
        System.out.println("Enter the number :");
         
        int inputNumber = sc.nextInt();
         
    
         
        int[] digitCount = new int[10];
         
        while (inputNumber != 0)
        {
            
             
            int lastDigit = inputNumber % 10;
             
            
             
            digitCount[lastDigit]++;
             
            
             
            inputNumber = inputNumber / 10;
        }
         
         
        System.out.println("===================");
         
        System.out.println("Digits : Frequency");
         
        System.out.println("===================");
         
        for (int i = 0; i < digitCount.length; i++)
        {
            if(digitCount[i] != 0)
            {
                System.out.println("   "+i+"   :   "+digitCount[i]);
            }
        } 
         
        sc.close();
    }
}
