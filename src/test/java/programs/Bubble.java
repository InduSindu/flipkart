package programs;

import java.util.Scanner;

public class Bubble 
{
	
	static int[] bubsort(int[] a,int n)
	{
		int temp;
		for(int j=1;j<n-1;j++)
		{
			
		   for(int i=0;i<n-j;i++)
		   {
			   if(a[i]>a[i+1])
			   {
				   temp=a[i];
				   a[i]=a[i+1];
				   a[i+1]=temp;
			   }
		   }
		
		}
		return a;
		
	}
	
	
	
   public static void main(String[] args)
   {
	   Scanner s1=new Scanner(System.in);
	   int n=10;
	   int[] a=new int[n];
	   
	   for(int i=0;i<n;i++)
	   {
		   a[i]=s1.nextInt();
	   }
	  int[] b=bubsort(a,n);
	  for(int i=0;i<10;i++)
	  {
		  System.out.print(b[i]+" ");
	  }
   }
}
