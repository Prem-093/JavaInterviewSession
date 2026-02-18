package LeetCodeDate02022026;

public class LeetCode10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc";
		
		//a	 (0,1)		//b	 (1,1)	//c (2,1)
		//ab (0,2)		//bc (1,2)	
		//abc(0,3)
		//n(n+1)/2=6
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
		
	}

}
