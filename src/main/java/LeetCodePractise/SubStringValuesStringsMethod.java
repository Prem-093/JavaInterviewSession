package LeetCodePractise;

public class SubStringValuesStringsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FirstWay
		
		
		  String s="Prem Mani Tripathi";
		  int first=s.indexOf(" ");
		  System.out.println(first); 
		
		  
		  int last=s.lastIndexOf(" ");
		  System.out.println(last);
		 
		  
		  String s1=s.charAt(0)+"";
		// String  s2=s.charAt(first+1)+"";
		  
		  String s2=s.substring(first+1,first+2);
		  
		  String s3=s.substring(last+1);
		  
		  String total=s1+" "+s2+" "+s3; 
		  System.out.println(total);
		 
		
		//2nd way
		
		/*
		 * String s="Prem Mani Tripathi";
		 * 
		 * String s1=s.substring(0,1); System.out.println(s1);
		 * 
		 * String s2=s.substring(5, 9); System.out.println(s2);
		 * 
		 * String s3=s.substring(10, 11); System.out.println(s3);
		 */
		
		

	}

}
