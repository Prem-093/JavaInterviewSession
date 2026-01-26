package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		
		for(int i=1; i<=10;i++)
		{
			int sum=n1+n2;
			//i=1//sum=1,n1=0,n2=1
			//i=2//n1=1,n2=1,sum=2
			//i=3//n1=1,n2=2,sum=3
			//i=4//n1=2,n2=3,sum=5
			//i=5//n1=3,n2=5,sum=8
			//i=6//n1=5,n2=8,sum=13
			//i=7//n1=8,n2=13,sum=21
			
			
			n1=n2;
			n2=sum;
			
			System.out.println(sum);
		}

	}

}
