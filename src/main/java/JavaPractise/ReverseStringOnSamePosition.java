package JavaPractise;

public class ReverseStringOnSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Reverse String On its Position";
		
		String s1[]=str.split("\\s");
		
		
		
		String Duplicate="";
		
		for(String e:s1)
		{
			String rev="";
			
			int len=e.length();
			
			for(int i=len-1; i>=0; i--)
			{
				rev =rev+ e.charAt(i);
			}
			Duplicate=Duplicate+rev+" ";
		}
		
		System.out.println(Duplicate);
}
}