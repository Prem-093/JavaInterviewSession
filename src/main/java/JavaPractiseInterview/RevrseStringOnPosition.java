package JavaPractiseInterview;

public class RevrseStringOnPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="We are Learning java";
		
	String arr[]=s.split(" ");
	
	String Reverse="";
	
	for(String e:arr)
	{
		String rev="";
		
		for(int i=e.length()-1; i>=0;i--)
			
		{
			rev=rev + e.charAt(i);
		}
		
		Reverse=Reverse+rev+" ";
	}
		
	System.out.println(Reverse);
	}

}
