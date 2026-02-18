package LeetCodePractise;

public class MaxNumOfSubstringsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcd";
		//max substring=n(n+1)/2
		//substring(0,1)     substring(1,2)	substring(2,3)
		//substring(0,2)	 substring(1,3)
		//substring(0,3)		
		System.out.println(s.length());
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1; j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));//a,ab,
				count++;
				
			}
		}
		System.out.println(count);
		
		
	}

}
