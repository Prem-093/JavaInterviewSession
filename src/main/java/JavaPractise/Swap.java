package JavaPractise;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		/*
		 * int temp=10; a=b; b=temp;
		 */
		
		System.out.println("value of a,b:"+a +","+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a,b:"+a +","+b);
		

	}

}
