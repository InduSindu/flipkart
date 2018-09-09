package programs;

public class PrimeRange 
{
    public static void main(String[] args)
    {
    	int num=1,count=0,n=20;
    	
    	while(num<=n)
    	{		
    	   for(int i=1;i<=num;i++)
    	  {
    		if(num % i==0)
    		{
    			count++;
    		}
    	  }	
    		if(count==2)
    		{
    			System.out.print(num+" ");
    		}
    		
    		count=0;
    		num++;
    	  
    }	
    	
    }







}
