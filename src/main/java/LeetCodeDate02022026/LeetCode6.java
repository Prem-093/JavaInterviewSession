package LeetCodeDate02022026;

public class LeetCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Prakash Mani Tripathi";
		
		String strArr[]=s.split(" ");
		String s1="";
		for(int i=0; i<=strArr.length-1; i++)
		{
				int len=strArr[i].length();
				if(len%2==0)
				{
					System.out.println(i+":"+strArr[i]);
				}
				
		}

	}

}
