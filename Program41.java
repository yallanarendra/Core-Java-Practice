//Write a Java program to find sum of all prime numbers between 1 to n.

public class Program41 {
  
public static void main(String args[])   
{  
int number = 1, count, sum = 0;  
 
while(number <= 100)  
{  
count = 0;  
int i = 2;  
while(i <= number/2 )  
{  
         
if(number % i == 0)  
{  
count++;  
break;  
}  
  
i++;  
}  
if(count == 0 && number != 1 )            
{  
     
sum = sum + number;  
}   
number++;  
}   
System.out.println("The Sum of Prime Numbers from 1 to 100 is: " + sum);  
}    
}   