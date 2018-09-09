package programs;

public class dimond2
{
	public static void main(String[] args) 
  {
		int n=4,t=1;
		char ch='a';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			  if(i+j>=n+1)
				  System.out.print(ch+++" ");
			  else
				  System.out.print(" ");
			}
		
		System.out.println();
	 }
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
			  if(j>=i)
				  System.out.print(" "+ch++);
			  else
				  System.out.print(" ");
			}
		
		System.out.println();
	 }
		
		

	}

}
