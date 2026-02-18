package LeetCodeDate02022026;

public class LeetCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get number count from sentence
		
		String s="Prem Prakash Mani Tripathi";
		
		int count=0;
		
	String strArr[]=s.split(" ");
		
		for(int i=0;i<=strArr.length-1;i++)
		{
		String str=	strArr[i];
		count ++;
		}
		System.out.println(count);
		

	}

}
