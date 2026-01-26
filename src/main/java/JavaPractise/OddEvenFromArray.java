package JavaPractise;

public class OddEvenFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int odd=0;
		int even=0;
		
		for(int i=0;i<=arr.length -1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even :"+arr[i]);
				even++;	
			
			}
			else
			{
				System.out.println("odd:"+arr[i]);
			}
			
			
		}
		System.out.println("even:"+even);
		

	}

}
