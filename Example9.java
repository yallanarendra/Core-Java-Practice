import java.util.Scanner;

 public class Example9
{ 
 public static void main(String[] args) 
 {
  Scanner in=new Scanner(System.in);
  int max=5;
  int a[]={15,35,21,5,9};
  int first,last,mid=0,flag=0,i,j,no,temp;
  //Arranging the element in ascending order
  for(i=0;i<max;i++)
  {
    for(j=0;j<(max-i-1);j++)
    {
     if(a[j]>a[j+1])
     {
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
     }
    }
  }
  //printing the element
  System.out.println("Element is given below");
  for(i=0;i<max;i++)
  System.out.print(a[i]+" ");
  first=0;
  last=max-1;
  System.out.println("\nEnter number to search");
  no=in.nextInt();
  while(first<=last)
  {
   mid=(first+last)/2;
   if(no==a[mid])
   {
    flag=1;
    break;
   }
   else
   {
    if(no>a[mid])
     first=mid+1;
    else
     last=mid-1;
   }
  }
  if(flag==1)
   System.out.println("Number is found at position "+(mid+1));
  else
   System.out.println("Number is not found");
 }
}
  
  