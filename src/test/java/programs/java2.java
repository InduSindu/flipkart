package programs;

public class java2 
{
   public static void main(String[] args)
   {
	   int k=1,p=5,q=8,count=1;
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   
			  if(j==1)
			  {
				  System.out.print(k++);
			  }
			  else if(j==2)
			  {
				  System.out.print(p++);
			  }
			  else if(j==3)
			  {
				  System.out.print(q++);
			  }
			  else if(j==4)
				  System.out.print(count);
			  else
				  System.out.print(" ");
		   }
		   System.out.println();
	   }
   }
}
