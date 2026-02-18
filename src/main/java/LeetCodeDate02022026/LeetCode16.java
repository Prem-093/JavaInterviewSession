package LeetCodeDate02022026;

public class LeetCode16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Prem";
		String s2="pRem";
		
		boolean flag=false;
		if(s1.length()==s2.length())
		{
		for(int i=0;i<=s1.length()-1;i++)
		{
		
			
			if(s1.charAt(i)!=s2.charAt(i))
			{
				flag=false;
				System.out.println("Both strings are not equal:"+flag);
				break;
			}
			else
			{
				flag=true;
				System.out.println("Both strings are equal:"+flag);
				
			}
			
		}

	}
		
		else
		{
			System.out.println("Size of string is not equal:"+flag);
		}

}
}
