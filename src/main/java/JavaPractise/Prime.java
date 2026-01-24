package JavaPractise;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=12;
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0) 
				{
				count++;
				}		
		}
			if(count==2)
			{
				System.out.println("Number is prime:"+num);
			}
			else
			{
				System.out.println("Num is not prime:"+num);
			}
			

	}

}
}
