//. Write a Java program to find first and last digit of a number.

public class Program27
{   
    public static void main(String args[]) 
    {   
        int number = 502356997;
        int firstDigit = 0;
        int lastDigit = 0;
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}