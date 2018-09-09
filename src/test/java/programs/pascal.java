package programs;

public class pascal {

	public static void main(String[] args)
	{
		int n=5,p;
		for(int i=0;i<n;i++)
		{
			int number=1;
			p=((n-i)*2);
			for(int j=0;j<n;j++)
			{
				if(i+j>n)
				{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
