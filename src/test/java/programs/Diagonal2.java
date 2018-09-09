package programs;

public class Diagonal2 
{
	
	
	public static void main(String[] args)
	{
		int p,q;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				p=1;
				q=0;
			}
			else
			{
				p=0;
				q=1;
			}
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					if(j%2==0)
						System.out.print(p);
					else
						System.out.print(q);
				}
				else
					System.out.print(" ");
					

			}
			System.out.println();
		}
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
