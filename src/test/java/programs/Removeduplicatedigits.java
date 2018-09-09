package programs;

public class Removeduplicatedigits {

	public static void main(String[] args) 
	{
		int n=5,count=1;;
		int[] a=new int[n];
		a[0]=10;
		a[1]=20;
		a[3]=10;
		a[4]=30;
		
		for(int i=0;i<n;i++)
		{
			if(a[i] != ' ')
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=' ';
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
				count=1;
			}
		}

	}

}
