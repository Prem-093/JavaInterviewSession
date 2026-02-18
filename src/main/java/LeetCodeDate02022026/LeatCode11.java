package LeetCodeDate02022026;

public class LeatCode11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//abcd
		//bcda
		//cdab
		//dabc
		
		String OriginalString="abcd";
		String rotationString="bcd";
        
		String TotalString=OriginalString+OriginalString;
		System.out.println(TotalString);
		boolean flag= false;
		if(OriginalString.length()!=rotationString.length())
		{
			flag= false;
			System.out.println("Strgs are not equal not possible to rotate:"+flag);
		}
		else if(TotalString.contains(rotationString))
		{
			flag=true;
			System.out.println("String is Rotatable:"+flag);
		}
		else
		{
			flag=false;
			System.out.println("String is not Rotatable:"+flag);
		}
		
		
		
	}

}

