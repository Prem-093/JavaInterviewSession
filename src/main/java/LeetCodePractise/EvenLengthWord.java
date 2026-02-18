package LeetCodePractise;

public class EvenLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prem Prakash Mani Tripathi";
		
	String stArr[]=s.split(" ");
	
	for(String e:stArr)
	{
		//System.out.println(e.length());
		int len=e.length();
		
		if(len%2==0)
		
		  { 
			System.out.println(e);
			}
		 
		
		
		
		
	}
		
		
		
		

	}

}
