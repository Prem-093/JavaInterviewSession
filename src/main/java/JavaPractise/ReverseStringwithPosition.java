package JavaPractise;

public class ReverseStringwithPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Reverse String only with Position";
		
		String strArr[]=s1.split("");
		
		String rev="";
		
		for (int i=strArr.length-1; i>=0; i--)
		{
			rev=rev + strArr[i];
		}
		System.out.println(rev);
	}

}
