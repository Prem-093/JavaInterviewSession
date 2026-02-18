package LeetCodeDate02022026;

public class LeetCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Prakash Mani Tripathi";
		
	//	String[] s1=s.split(" ");
		
		/*
		 * for(int i=0;i<=s1.length-1;i++) { String s2=s1[i];
		 * System.out.println(s2+"->"+s2.length()); }
		 */
		
		// String s="Prem Prakash Mani Tripathi";
	     
		   
	     
	     for(int i=0;i<=s.length()-1;i++)
	     {
	      String s1="";
	     
	     while(i<s.length() && s.charAt(i)!=' ') 
	     {
	      s1=s1+s.charAt(i)+"";
	      i++;
	      System.out.println(s1+"->"+s1.length());
	     }
			
			  if(s1.length()>0)
			  { System.out.println(s1+"->"+s1.length()); 
			  }
			 
	     }
		
		
	}

}
