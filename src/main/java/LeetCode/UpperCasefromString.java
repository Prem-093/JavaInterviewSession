package LeetCode;

public class UpperCasefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="PremPrakashManiTripathi";
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<=input.length()-1;i++)
		{
			char c=input.charAt(i);
			if(Character.isUpperCase(c))
			{
				result.append(c);
			}
		}
		System.out.println(result);

	}

}
