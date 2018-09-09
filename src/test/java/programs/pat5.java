package programs;

public class pat5 {

	public static void main(String[] args) 
	{
		char ch;
		int n=4,t=7,s=1;
//		for(int i=1;i<=n;i++)
//		{
//			ch=(char)('A'+i-1);
//			for(int j=1;j<=n;j++)
//			{
//				if(i+j>=n+1 &&  j<=i)
//				{
//					System.out.print(ch--);
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

//		for(int i=1;i<=n;i++)
//		{
//			for(int j=4;j>i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=t;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			t=t+2;;
//		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=t;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			t=t-2;;
		}
	}

}
