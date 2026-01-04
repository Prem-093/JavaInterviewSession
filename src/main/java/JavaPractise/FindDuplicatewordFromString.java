package JavaPractise;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatewordFromString {

	public static void main(String[] args) {
		
		String str="Welcome to java java world";
		
		String[] str1=str.split("\\s");
		
		Set<String> set= new HashSet<String>();
		int count=0;
		for (String s:str1)
		{
			if(!set.add(s))
			{
				System.out.println("Duplicate number"+set+count);
				count ++;
			}
		}
		
				
		
		

	}

}
