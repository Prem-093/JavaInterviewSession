
package JavaPractise;

public class EvenIndexChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium" ;//Slnu
		
		char chArr[]=s.toCharArray();
		char ch;
		for(char e:chArr)
		{
			int i=s.indexOf(e);
			
			if(!(i%2==0))
			{
			ch=s.charAt(i);	
			System.out.println("ODD index char:"+ch);
			}
			else if(i%2==0)
			{
				ch=s.charAt(i);	
				System.out.println("Even index char:"+ch);
				}
		}
	
		

	}

}
