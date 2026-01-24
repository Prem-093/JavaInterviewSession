package JavaPrograms;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ODD even on single num
		
		/*
		 * int num=9;
		 * 
		 * if(num%2==0) { System.out.println("Num is even :"+num); } else {
		 * System.out.println("Num is ODD:"+num); }
		 */
		 
	
		//Find ODD and even Number from group of numbers
		
		int num[]= {2,5,7,9,10};
		
		int evenCount=0;
		int oddCount=0;
		int len=num.length-1;
		
		for(int i=0;i<=len;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println("Number is even :"+num[i]);
				evenCount++;
			}
			else
			{
				System.out.println("Number is ODD :"+num[i]);
				oddCount++;
			}
		}
		System.out.println("Total even number:"+evenCount);
		System.out.println("Total ODD number:"+oddCount);
		
		
		
		
		
		

	}

}
