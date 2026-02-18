package LeetCodePractise;

public class EvenIndexWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Prakash Mani Tripathi";
		
		String strArr[]=s.split(" ");
		
		for(int i=0;i<=strArr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i +":"+strArr[i]);
			}
		}

	}

}
