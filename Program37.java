//Write a Java program to find all factors of a number.

public class Program37 {
 
    public static void main(String[] args) {
        //number
        int num = 100;
         
        //find all factors
        for(int i = 1; i <= num; ++i) {
            //check if i is a factor of num
            if(num % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}