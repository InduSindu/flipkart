package programs;

public class countspl {

	public static void main(String[] args) 
	{
		String s1="tgfs#@$,.hhhdh453%67+";
		String s2="";
		String s3="";
		String s4="";
		int count=1;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
				s2=s2+ch;
			else if(Character.isAlphabetic(ch))
				s3=s3+ch;
			else
			{
				s4=s4+ch;
				count++;
			}
		}
		System.out.println(s4+"  "+count);
	}

}
