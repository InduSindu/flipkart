package programs;

import java.util.ArrayList;
import java.util.List;

public class output
{

	static void makeNull(List<String> l1)
	{
		System.out.println(l1);
		l1.add("3");
		System.out.println(l1);
	}
	
	public static void main(String[] args)
	{
		List<String> lst=new ArrayList<String>();
		lst.add("1");
		lst.add("2");
		System.out.println(lst);
	   makeNull(lst);
	   System.out.println(lst);
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
