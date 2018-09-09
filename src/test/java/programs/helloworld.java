package programs;

public class helloworld
{

	public static void main(String[] args)
	{
		String s1="HELLO";
		int n,t=1;
		n=s1.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<t;k++)
			{
				System.out.print(s1.charAt(k)+" ");
			}
			t=t+1;
			System.out.println();
		}
	 }
		
	

}
