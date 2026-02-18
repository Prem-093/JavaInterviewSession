package LeetCode05022026;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="aaabbcdd";
		int count=1;
	String ss=s.charAt(0)+"";
	
	for(int i=1;i<=s.length()-1;i++)
	{
	char curr=s.charAt(i);
	char prev=s.charAt(i-1);
	
	if(curr==prev)
	{
		count++;
	}
	else {
		
		if(count>1)
		{
			ss+=count;
			count=1;
		}
		
		ss+=curr;
	}
		
	}
	
	if(count>1)
	{
		ss+=count;
		count=1;
	}
	
	System.out.println(ss);
		
		
		
		
	}

}
