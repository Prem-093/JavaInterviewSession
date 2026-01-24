package JavaProgramString;

public class EvenIndexChar {

	public static void main(String[] args) {
	
		
		String s="Selenium";
		
		char charArr[]=s.toCharArray();
		
		
		for(int i=0;i<=charArr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even index char:"+charArr[i]);
			}
		}
	}

}
