package LeetCode;

public class StringCompressionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbbcddd";
		
		String ss=s.charAt(0)+"";
		
		for(int i=1; i<=s.length()-1;i++)
		{
			char curr=s.charAt(i);
			char prev=s.charAt(i-1);
			
			if(curr!=prev)
			{
				ss+=curr;
			}
		}
		System.out.println(ss);

	}

}
