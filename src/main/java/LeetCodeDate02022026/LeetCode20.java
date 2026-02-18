package LeetCodeDate02022026;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LeetCode20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unique character
		
		String s="PremPrakashManiTripathi";
		
		char[] ch=s.toCharArray();
		Set<Character> set=new HashSet<Character>();
		
		for(char e:ch)
		{
			if(!set.add(e))
			{
				System.out.print(e);
			}
		}
	  
		
	}

}
