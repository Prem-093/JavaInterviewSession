package JavaPrograms;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =153;
		
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
