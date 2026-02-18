package LeetCodePractise;

public class SubstringsValuesusingCharArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Prem Mani Tripathi";
		System.out.println(s.length());
	String part[]=s.split(" ");
	
	System.out.println(part.length);
		//part[0].substring(0, 1);
	

	
		
		String frChar=part[0].charAt(0)+"";
		String mChar=part[1].substring(0,1);
		String third=part[2];
		
		String full=frChar+" "+mChar+" "+third;
		System.out.println(full);
		
		
		
		
		
		
	}
		
		
		
		
		
	}


