package JavaPractise;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =121;
		
		int evencount=0;
		int oddcount=0;
		
		while(num!=0)
		{
			int rem=num%2;
			if(rem==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
