package JavaPractise;

public class GetNumberofCharOccurenceInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Selenium";
		
		int len=s.length();
		
	String s1=	s.replaceAll("e","");
	int len1=s1.length();
	System.out.println(len-len1);
	
		
	}

}
