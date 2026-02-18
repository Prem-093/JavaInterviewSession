package LeetCodePractise;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="abcd";
		//abcd
		//bcda cdab dabc
		
		String rotated="bcda";
		boolean flag=false;
		if(original.equals(null) || rotated.equals(null))
		{
			flag=false;
			System.out.println("String is not rotaeble:"+flag);
		}
		else if(original.length()!=rotated.length())
		{
			flag=false;
			System.out.println("String is not rotaeble:"+flag);
		}
		else 
		{
			
			String concateneted=original+original;
			System.out.println(concateneted);
			
			if(concateneted.contains(rotated))
			{
			flag=true;
			System.out.println("String is rotatd:"+flag);
			}
			else
			{
				flag=false;
				System.out.println("String is not rotaeble:"+flag);
			}
			
			
		}
		
		

	}

}
