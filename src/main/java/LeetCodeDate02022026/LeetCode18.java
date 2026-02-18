package LeetCodeDate02022026;

public class LeetCode18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Prakash Mani Tripathi";
		
		String stArr[]=s.split(" ");
		
		String totalrev="";
		
		for(String e:stArr)
		{
			String rev="";
			for(int i=e.length()-1;i>=0;i--)
			{
			  rev=rev+e.charAt(i)+"";
			
			}
			
			totalrev=totalrev+rev+" ";
		}
		
	System.out.println(totalrev);
	}

}
