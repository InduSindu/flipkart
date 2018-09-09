package programs;

public class occuerencesofChars 
{

	//private static final char NULL =;

	public static void main(String[] args) 
	{
	  String s1="hellohihow hi";
	  int count=1;
	  char[] ch = s1.toCharArray();
	  int size=ch.length;
    for(int i=0;i<size;i++)
    {
    	
    	if(ch[i]!=' ')
    	{
    		for(int j=i+1;j<size;j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				ch[j]=' ';
    				count++;
    			}
    		}
    		System.out.println(ch[i]+" "+count);
    		count=1;
    	}
    	
    
    }
	  
	  
	  
	  
	}

}
