package LeetCode;

public class Permutation {
	
	public static void printPermutations(String ques,String asf)
	{
		
		for(int i=0;i<=ques.length()-1;i++)
		{
			char ch=ques.charAt(i);
			String left=ques.substring(0, i);
			String right=ques.substring(i+1);
			String newQues=left+right;
			printPermutations(newQues,asf+ch);
			
		}
		if(ques.length()==0)
		{
			System.out.println(asf);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPermutations("abc","");


	}

}
