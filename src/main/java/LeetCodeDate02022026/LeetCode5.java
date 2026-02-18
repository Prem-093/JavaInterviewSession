package LeetCodeDate02022026;

public class LeetCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Prem";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i)+"";
		}
		System.out.println(rev);
	}

}
