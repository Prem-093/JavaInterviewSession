package JavaProgramString;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="Prem";
		String b="Tripathi";
		a=a+b;
		//a+b=PremTripathi
		b=a.substring(0, a.length()-b.length());
		//0,12-8
		//0,4
		System.out.println(a);
		System.out.println(b);
	//	b=prem
		a=a.substring(b.length());
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}

}
