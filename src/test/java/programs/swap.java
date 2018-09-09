package programs;

public class swap {

	public static void main(String[] args)
	{
	   int a=70,b=45;
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println(a+" "+b);
	   
	   String s1="java";
	   String s2="mava";
	   s1=s1+s2;
	   s2=s1.substring(0,s1.length()-s2.length());
	   s1=s1.substring(s2.length());
	   System.out.println(s1+" "+s2);

	}

}
