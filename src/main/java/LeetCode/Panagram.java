package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="qwertyuiopasdfghklmnbv";
		
		
		//String is panagram with set
		System.out.println(s.length());
		
		Set set=new HashSet();
		
		for(int i=0; i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			set.add(ch);	
		}
		if(set.size()==26)
		{
			System.out.println("String is panagram ");
		}
		else
		{
			System.out.println("String is not panagram");
		}
		
		
		//String is panagram with boolean
		
		//Boolean[] Bool=new Boolean[26];
		
		/*
		 * for(int i=0; i<=s.length()-1;i++) { Bool[s.charAt(i)- 'a']=true;
		 * 
		 * 
		 * for(Boolean e:Bool) { if(e==false) {
		 * System.out.println("String is not panagram"); } else {
		 * System.out.println("String is panagram"); } } }
		 */
	
	}

}
