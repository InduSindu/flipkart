package programs;

public class java3 
{
   public static void main(String[] args)
   {
	   int n=5,k=5,p;
	   p=k;
	   //char ch='A';
	   for(int i=1;i<=n;i++)
	   {
		   //k=1+i-1;
		   k=p;
		   for(int j=1;j<=n;j++)
		   {
			   if(j>=i)
				   System.out.print(k--);
			   else
				   System.out.print(" ");
		   }
		   p--;
	   System.out.println();
	   }
   }
}
