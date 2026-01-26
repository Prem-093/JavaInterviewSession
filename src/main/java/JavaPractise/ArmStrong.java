package JavaPractise;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153;
		
		int armstronmum=num;
		
		int ArmStrong=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			ArmStrong=ArmStrong+rem*rem*rem;
			
			num=num/10;
		}
		System.out.println(ArmStrong);
		
		if(armstronmum==ArmStrong)
		{
			System.out.println("num is armstrong");
		}
		
	}

}
