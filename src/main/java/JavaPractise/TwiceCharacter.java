package JavaPractise;

public class TwiceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Prem";
		char ch[] = s.toCharArray();
		
		StringBuffer buffer=new StringBuffer();

		//StringBuilder builder = new StringBuilder();

		for (char c : ch) {

			//builder.append(c).append(c);
			buffer.append(c).append(c);

		}
		System.out.println(buffer);
	}

}
