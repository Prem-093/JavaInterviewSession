package JavaPrograms;

public class NumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=3456;
		
		int no=0;
		int count=0;

		if(num<0)
		{
			no=-1;
		}
		else if(num==0)
		{
			System.out.println("invalid number");
		}
		else if(num>0)
		{
			while(num>0)
			{
				int rem=num%10;
				count ++;
				num=num/10;
			}
		}
		
		System.out.println("number of digit:"+count);
	}

}
