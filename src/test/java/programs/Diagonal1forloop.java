package programs;

public class Diagonal1forloop
{
	
	static void space(int s,int i)
	{
		if(s<i)
		{
		System.out.print(" ");
		s++;
		space(s,i);
		}
		else
			System.out.println("*");
	}
	
	
    public static void main(String[] args)
    {
    	int j=1;
    	for(int i=1;i<=4;i++)
    	{
    		int s=1;
    		space(s,i);
    	}
    }




}

