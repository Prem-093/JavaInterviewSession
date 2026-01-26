package JavaPrograms;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
		int rev=0;
		int num1=121;
		
		while(num>0)
		{
			int rem=num%10;
			
			rev=rev*10+rem;
			
			num=num/10;
		}
		System.out.println(rev);
		if(rev==num1)
		{
			System.out.println("num is palindrom");
		}

	}

}
