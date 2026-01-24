package JavaPractise;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello";

		String b = "world";

		a =a+b;
		System.out.println(a);
		
		b=a.substring(0, a.length()-b.length());
		System.out.println(b);

		a=a.substring(b.length());
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}

}
