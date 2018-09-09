package programs;

public class pat2 
{
    public static void main(String[] args)
    {
    	int n=4,count=0,s=7;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=s;k>=1;k--)
    		{
    			if(i%2==0)
    			{
    				System.out.print(count);
    				count=(count+2)%10;
    			}
    			else
    			{
    				System.out.print("*");
    			}
    		    
    		}
    		System.out.println();
    		s=s-2;
    	}
    	int t=1;
    	count=0;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=4;j>i;j--)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1;k<=t;k++)
    		{
    			if(i%2==1)
    			{
    				System.out.print("*");
    				
    			}
    			else
    			{
    				System.out.print(count);
    				count=(count+2)%10;
    			}
    		    
    		}
    		System.out.println();
    		t=t+2;
    	}
    }
}
