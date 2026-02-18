package LeetCodeDate02022026;

public class Leetcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Prem Prakash Mani Tripathi";
		
		String sArr[]=s.split(" ");
		
		String rev="";
		
		for(int i=sArr.length-1;i>=0;i--)
		{
		rev=rev+sArr[i]+" ";
		}
		
		System.out.println(rev);
	}

}
