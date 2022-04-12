//Write a Java program to print all Prime numbers between 1 to n.

import java.util.Scanner;
 
public class Program40{
 
    private static Scanner scanner = new Scanner( System.in );
 
    public static void main(String[] args) {
 
        System.out.println("Enter max number: ");
 
        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );
 
        System.out.println("List of the prime number between 1 - " + maxNumber);
 
        for (int num = 2; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
    }
}