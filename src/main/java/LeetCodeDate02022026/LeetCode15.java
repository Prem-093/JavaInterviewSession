package LeetCodeDate02022026;

public class LeetCode15 {

	public static void main(String[] args) {
		
		
		String s="Prem Prakash Mani Tripathi";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			String s1="";
			
			while(i<ch.length && ch[i]!=' ')
			{
				
			s1=s1+ch[i];
			
			i++;
			}
		System.out.println(s1+"->"+s1.length());
		}
		
		

	}

}
