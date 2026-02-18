package LeetCodeDate02022026;

public class LeetCode17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="PremPrakashManiTripathi";
		
		StringBuilder builder=new StringBuilder();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				
				builder.append(ch);
			}
		}
		System.out.println(builder);

	}

}
