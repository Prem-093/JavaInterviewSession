package JavaProgramString;

public class Charprintchoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Prem";
		
	char charArr[]=	s.toCharArray();
		
		StringBuffer buffer=new StringBuffer();
		
		for(int i=0;i<=charArr.length-1;i++)
		{
		  buffer.append(charArr[i]).append(charArr[i]);
		
	}
		  System.out.println(buffer);

}
}
