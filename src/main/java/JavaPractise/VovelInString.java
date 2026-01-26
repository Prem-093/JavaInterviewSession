package JavaPractise;

public class VovelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium";
		//'a'||'e'||'i'||'o'||'u'
		char chArr[]=s.toCharArray();
		
		int vowel=0;
		int Constaint=0;
		
		for(int i=0; i<=chArr.length -1;i++)
		{
			
			if(chArr[i]=='a'||chArr[i]=='e'||chArr[i]=='i'||chArr[i]=='o'||chArr[i]=='u')
			{
				
				System.out.println("Vowel:"+chArr[i]);
				vowel++;
				
			}
			else
			{
				System.out.println("Constaint:"+chArr[i]);
				Constaint++;
			}
			
		}
			System.out.println("Vowel count:"+vowel);
			System.out.println("Constaint count:"+Constaint);
	}

}
