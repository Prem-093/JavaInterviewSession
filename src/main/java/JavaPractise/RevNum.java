package JavaPractise;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=111;
		int rev=0;
		int palin=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(palin);
		
		if(palin==rev)
		{
			System.out.println("Number is palindrom");
		}
		
	
	}

}
