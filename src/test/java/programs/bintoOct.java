package programs;

public class bintoOct
{
   public static void main(String[] args)
   {
	 int r,bin,bin1,dec=0,m=1,j;
	 bin=111;
	 int[] oct=new int[20];
	 bin1=bin;
	   while(bin!=0)
	   {
		   r=bin%10;
		   dec=dec+r*m;
		   m=m*2;
		   bin=bin/10;
	   }
	   m=1;
	   int q=dec;
	   
	   while(q!=0)
	   {
		   oct[m++]=q%8;
		   q=q/8;
	   }
	   
	   for(j=m-1;j>0;j--)
	   {
		   System.out.println(oct[j]);
	   }
   }
	
	
	
	
	
	
	
	
	
}
