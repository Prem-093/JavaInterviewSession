package JavaProgramString;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="madam";
		int len=s.length();
		String rev="";
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("String is palindrom");
		}
	}

}
