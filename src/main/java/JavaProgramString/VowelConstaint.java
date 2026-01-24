package JavaProgramString;

public class VowelConstaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium";
		
		char chArr[]=s.toCharArray();
		
		for(int e=0;e<=chArr.length-1;e++)
		{
			if(chArr[e]=='a'||chArr[e]=='e'||chArr[e]=='i'||chArr[e]=='o'||chArr[e]=='u')
			{
				System.out.println("vowel:"+chArr[e]);
			}
			else
			{
			System.out.println("constaint:"+chArr[e]);	
			}
		}

	}

}
