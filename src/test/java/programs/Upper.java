package programs;

public class Upper
{
  public static void main(String[] args)
  {
	  int k,n=4;
	  
	  for(int i=1;i<=n;i++)
	  {
		  k=1;
		  for(int j=1;j<=n;j++)
		  {
			  if(i+j>=n+1)
			  {
				  System.out.print(k+++" ");
			  }
			  else
				  System.out.print(" ");
		  }
		  System.out.println();
	  }
  }
}
