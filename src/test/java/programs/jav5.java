package programs;

public class jav5
{
   public static void main(String[] args)
   {
	   int k=1,p=k;
	   int n=4;
	   for(int i=1;i<=4;i++)
	   {
		   
		   k=p;
		   for(int j=1;j<=4;j++)
		   {
			   if(i+j>=n+1)
			   {
				   System.out.print(k--);
			   }
			   else
				   System.out.print(" ");
		   }
		   
		   System.out.println();
		   
	   }
   }
}
