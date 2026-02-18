
package LeetCode;

public class CompreToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="prem";
		String s2="Prem";
		
	
		boolean isCompare=false;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			
			if(s1.charAt(i)!=s2.charAt(i))	
			{
				isCompare=false;
				System.out.println("Both Strings are not equal:"+isCompare);
				break;
			}
			else
			{
				isCompare=true;
						
			}
			System.out.println("Both string s1 and s2 are equals:"+isCompare);
		}
		
		

				
	
	}

}
