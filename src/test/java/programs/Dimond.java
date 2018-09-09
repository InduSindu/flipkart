package programs;

public class Dimond {

	public static void main(String[] args) 
  {
		int n=4,t=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=t;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			t=t+2;
		}
		int p=5;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=p;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			p=p-2;
		}

	}

}
