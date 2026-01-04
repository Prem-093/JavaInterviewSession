package JavaPractise;

public class ReverseStringwithPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Reverse String only with Position";
		
	String str[]=	s1.split("\\s");
	
int len=str.length;
	String rev="";

	for (int i=len-1; i>=0; i-- )
	{
		rev=rev +str[i] +" ";
	}
		System.out.println(rev);
	}

}
