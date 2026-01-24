package JavaProgramString;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Mary";
		String s1="Army";
		char chArr1[]=s.toLowerCase().toCharArray();
		char chArr2[]=s1.toLowerCase().toCharArray();
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		if(Arrays.equals(chArr1, chArr2))
		{
			System.out.println("String are Anagram");
		}
		
		

	}

}
