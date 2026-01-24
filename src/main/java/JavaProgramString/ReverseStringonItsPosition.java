package JavaProgramString;

public class ReverseStringonItsPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="My name is Prem";
		
		String strArr[]=s.split(" ");
		String Original="";
		
		for(String e:strArr)
		{
			String rev="";
			int len=e.length();
			for(int i=len-1; i>=0; i--)
			{
				rev=rev+e.charAt(i);
			}
			Original=Original+rev+" ";
		}
		
		System.out.println(Original);
		
	}

}
