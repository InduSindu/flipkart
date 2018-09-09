package programs;

public class jaihoo {

	public static void main(String[] args) 
	{
		int k=5,p;
		p=k;
		char ch='e';
		char g=ch;
		for(int i=1;i<=5;i++)
		{
			k=p;
			ch=g;
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					if(i%2==0)
					{
						System.out.print(k--);
					}
					else
						System.out.print(ch--);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		  p--;
		  g--;
		}

	}

}
