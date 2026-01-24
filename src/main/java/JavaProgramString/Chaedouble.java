package JavaProgramString;

public class Chaedouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="prem";
		
		char chArr[]=s.toCharArray();
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<=s.length()-1;i++)
		{
		buffer.append(chArr[i]).append(chArr[i]);	
		}
		System.out.println(buffer);
		
	}

}
