package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
	 String model;
	 double price;
	 int n;
	 Car c1;
	 List l1=new ArrayList();
	 Scanner s1=new Scanner(System.in);
	 System.out.println("Entre the number of car objects");
	 n=s1.nextInt();
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("Enter themodel");
		 model=s1.next();
		 System.out.println("Enter the price");
	      price=s1.nextDouble();
	  c1=new Car(model,price);
	  l1.add(c1);
	 }
	 Collections.sort(l1,new Sort_Model());
	 System.out.println(l1);

	}

}
