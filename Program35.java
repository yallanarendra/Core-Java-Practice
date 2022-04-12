// Write a Java program to print all ASCII character with their values.

public class Program35 {
	public static void main(String[] args) 
	{
		int i = 0;
		
		while(i <= 255)
		{
			System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
			i++;
		}
	}
}
