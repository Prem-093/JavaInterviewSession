package LeetCode05022026;

public class VowelConstatint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Prkash Mani Tripathi";
		int vowelcount=0;
		int consonentCount=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			while(i<s.length() && s.charAt(i)!=' ')
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					System.out.println("Vowel:"+s.charAt(i));
					vowelcount++;
				}
				else
				{
					System.out.println("Consonent:"+s.charAt(i));
					consonentCount++;
				}
				i++;
			}
		}

	}

}
