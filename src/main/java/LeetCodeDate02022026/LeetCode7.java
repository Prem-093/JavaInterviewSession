package LeetCodeDate02022026;

import java.util.HashSet;
import java.util.Set;

public class LeetCode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Panagram
		
		String s="qwertyuiopasdfghjklzxcvbnm";
		
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			set.add(ch);
		}
		
		if(set.size()==26)
		{
			System.out.println("String is panagram"
					+ "");
		}
		else
		{
			System.out.println("String is not panagram");
		}

	}

}
