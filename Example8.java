// WAP to print duplicate elements in an array.

public class Example8 {
  
  public static void main(String[] args) {
    
    int[] ar = {10,50,50,30,15,10,30,};
    
    for (int i = 0; i < ar.length-1;i++) {
      
      for (int j = i+1; j < ar.length; j++) {
        
        if ((ar[i] == ar[j]) && (i != j)) {
          
          System.out.println("Duplicate element is "+ar[j]);
          }
        }
      }
    }
}

