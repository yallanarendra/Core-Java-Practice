//Write a Java program to find maximum between three numbers
import java.util.Scanner;
class Program2 {
  
    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the first no");
      
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();
        System.out.println("Enter the third no");
        int c = sc.nextInt();
 
 if(a>b && a>c)
 { 
         System.out.println(a+" is the maximum no");
 
 }
 else if(b>a && b>c)
 { 
 
 
         System.out.println(b+" is the maximum no");
 }
 else
 { 
         	System.out.println(c+" is the maximum no");
   }
 
   }
}
