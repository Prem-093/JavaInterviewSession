package LeetCodePractise;

public class FirstLetterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Mani Tripathi";
		
		
		System.out.println(s.length());
		
		String stArr[]=s.split(" ");
		
		for(int i=0;i<=stArr.length-1;i++)
		{
			String s1=stArr[i];
		char ch=s1.charAt(0);
		System.out.println(ch);
		}
		
		

	}

}
