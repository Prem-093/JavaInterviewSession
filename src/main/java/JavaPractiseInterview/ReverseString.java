package JavaPractiseInterview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="Prem";
	
	int len=s.length()-1;
	
	String rev="";
	
	for(int i=len; i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	}

}
