package programs;

public class pat3 {

	public static void main(String[] args)
	{
		String s1;
		//int t=s1.length();
		int t=7;
		for(int i=0;i<4;i++)
			
		{
			 s1="QSPIDER";
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<t;k++)
			{
				if(i%2==0)
				{
					System.out.print(s1.charAt(k));
				}
				else
					System.out.print("*");
			}
			System.out.println();
			t=t-2;
		}
	
	
	}

}
