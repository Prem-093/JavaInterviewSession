package LeetCodePractise;

public class NoOfVowelAndConstaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Prem Prakash Mani Tripathi";
		String s1=s.replaceAll(" ", "");
		int vowelcount=0;
		int consonentcount=0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				System.out.println("vowel char:"+s1.charAt(i));
				vowelcount++;
			}
			else
			{
				System.out.println("Constaint char:"+s1.charAt(i));
				consonentcount++;
			}
		}
		
		System.out.println(vowelcount);
		System.out.println(consonentcount);
		
	}

}
