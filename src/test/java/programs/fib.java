package programs;

public class fib 
{
	
	public static void main(String[] args)
	{
		int n=10;
		int[] a=new int[n];
		a[0]=0;
		a[1]=1;
		//System.out.print(a[0]+" "+a[1]);
		for(int i=0;i<=10;i++)
		{ a[0]=0;
		  a[1]=1;
			//a[i]=a[i-1]+a[i-2];
		}
	  for(int i=0;i<10;i++)
	  {
		  System.out.println(a[i]+" ");
	  }
	
	}
	

}
