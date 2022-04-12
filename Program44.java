//Write a Java program to print all Armstrong numbers between 1 to n.

import java.util.Scanner;
 
public class Program44 {
    public static void main(String[] args) {
        double N;
        int i;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        N = scanner.nextFloat();
        System.out.println("Armstrong Number between 0 to " + (int) N);

      
        for (i = 0; i < N; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }
 
    public static boolean isArmstrongNumber(int num) {
        int sum = 0, rightDigit, temp;
        temp = num;
        while (temp != 0) {
            rightDigit = temp % 10;
            sum = sum + (rightDigit * rightDigit * rightDigit);
            temp = temp / 10;
        }
        
        if (sum == num) {
            
            return true;
        } else {
            
            return false;
        }
    }
}