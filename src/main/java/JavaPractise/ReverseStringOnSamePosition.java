package JavaPractise;

public class ReverseStringOnSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Reverse String On its Position";
		String result="";
		String strarry[]=str.split("\\s");
		
		for(String e:strarry)
		{
			String rev="";
			int len=e.length();
			
			for(int i=len-1; i>=0; i--)
			{
				rev=rev+e.charAt(i);
				
			}
			
			result=result+ rev + " ";
			
			
		}
		System.out.println(result);
		
		
		
	}

}
