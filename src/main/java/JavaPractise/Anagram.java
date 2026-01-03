package JavaPractise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="Mary";
		
		String s2="Army";
		
		
		
		char[] str1=s1.toLowerCase().toCharArray();
		
		char[] str2=s2.toLowerCase().toCharArray();
		
	//	System.out.println(str1);
	//	System.out.println(str2);
		
	
		Arrays.sort(str1);
		
		//System.out.println(str1);
	
		Arrays.sort(str2);
		
		//System.out.println(str2);
		
		if(Arrays.equals(str1, str2))
		{
			System.out.println("Strings are anagram :"+str1 +" : "+ str2 );
		}
	

	}

}
