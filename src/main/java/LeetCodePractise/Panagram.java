package LeetCodePractise;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="qwertyuiopasdfghjklzxcvbnm";
		char chArr[]=s.toCharArray();
		
		Set<Character> set=new HashSet<Character>();
		
		for(char e:chArr)
		{
			set.add(e);		
			
		}
	
		if(set.size()==26)
		{
			System.out.println("String is palagram");
		}
		else
		{
			System.out.println("String is not palagram");
		}
		

	}

}
