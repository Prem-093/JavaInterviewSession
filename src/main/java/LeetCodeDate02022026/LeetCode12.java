
package LeetCodeDate02022026;

import java.util.HashSet;
import java.util.Set;

public class LeetCode12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way
		/*
		 * String s="aabbbcddd";
		 * 
		 * Set<Character> set=new HashSet<Character>();
		 * 
		 * char chArr[]=s.toCharArray(); for(char e:chArr) { set.add(e); }
		 * System.out.println(set);
		 * 
		 * StringBuffer buffer=new StringBuffer();
		 * 
		 * for(Character c:set) { buffer.append(c); }
		 * System.out.println(buffer.toString());
		 */
		
		//2nd way
		
		String s="aabbbcddd";
		
	String ss=s.charAt(0)+"";
	
	for(int i=1; i<=s.length()-1;i++)
	{
		char current=s.charAt(i);
		char prev=s.charAt(i-1);
		
		if(current!=prev)
		{
			ss+=current;
		}
		
	}
		System.out.println(ss);
		
		
	
		
		
		
				

	}

}
