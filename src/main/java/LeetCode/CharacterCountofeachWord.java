package LeetCode;



public class CharacterCountofeachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Prem Prakash Mani Tripathi";
		
		/*
		 * char ch[]=s.toCharArray();
		 * 
		 * for(int i=0;i<=ch.length-1; i++) { String s1="";
		 * 
		 * while(i<ch.length && ch[i]!=' ') { s1=s1+ch[i]; i++; }
		 * 
		 * if(s1.length()>0) { System.out.println(s1 +"->"+s1.length()); } }
		 */
		
		 for(int i=0;i<=s.length()-1;i++)
		   {
		      String s1="";
		      
		      while(i<s.length() && s.charAt(i)!=' ')
		      {
		          s1=s1+s.charAt(i)+"";
		          i++;
		      }
		   if(s1.length()>0)
		   {
		       System.out.println(s1+"->"+s1.length());
		   }
		   }
		 
	
	     
		   
	     
	     
	
	
		
	}

}
