//Write a Java program to input electricity unit charges and calculate total     electricity bill according to the given condition:
    //For first 50 units Rs. 0.50/unit
    //For next 100 units Rs. 0.75/unit
    //For next 100 units Rs. 1.20/unit
     //For unit above 250 Rs. 1.50/unit
     //An additional surcharge of 20% is added to the bill

class Program15  {
  
    
    public static void main(String args[]) {  
         
      
        int units = 100;  
          
        double TotalAmount = 0;  
          
        if(units <= 50) {
          
            TotalAmount = units * 0.50;  
        }  
         
        else if(units <= 150) {  
            TotalAmount = (0.50*50) + (0.75*100);  
        }  
         
        else if(units <= 250)  
        {  
           TotalAmount = (0.50*50) + (0.75*100) + (1.20*100);  
        }  
       else if(units >= 250)  
        {  
            TotalAmount = (0.50*50) + (0.75*100) + (1.20*100) + (1.50*(units-250));  
        }  
     
        System.out.println("TotalAmount 20%added total electricity bill="  +TotalAmount);   
    }   
}  
          
    


          
 
      
   
     