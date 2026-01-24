package JavaPractiseInterview;

public class ReverseStringWithPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="We are learning java";
				
				String arr[]=s.split(" ");
				
				int len=arr.length;
				String rev="";
				
				for(int i=len-1;i>=0;i--)
				{
					rev=rev+arr[i]+" ";
				}
				
				System.out.println(rev);
;
	}

}
