package programs;

public class swapStrings
{

	public static void main(String[] args) 
	{
		 int[] a={10,20,30,40,50};
		 int[] b={1,2,3,4,5};
		 int[] c=new int[10];
		 int p=0;
		 for(int i=0;i<5;i++)
		 {
			 for(int j=p;j<p+2;j++)
			 {
				 if(j%2==0)
					 c[j]=a[i];
				 else
					 c[j]=b[i];
				 
			 }
			 p=p+2;
		 }
		 for(int i=0;i<10;i++)
		 {
			 System.out.print(c[i]+" ");
		 }
	}

}
