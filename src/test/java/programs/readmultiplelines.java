package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class readmultiplelines 
{
  public static void main(String[] args)
  {
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter the nuber of lines");
	  int k=s1.nextInt();
	  String[] arr=new String[k];
	  String[] wrds= new String[10];
	  s1.nextLine();
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=s1.nextLine();
	  }
	  
	  //System.out.println("input");
	  for(String p:arr)
	  {
		  System.out.println(p);
		 wrds =p.split(" ");
		  
	  }
	  
	  System.out.println(wrds.length);
	  
  }
}