package JavaPractise;

public class LargestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {9,3,5,7,2};
		
		int smallest=arr[0];
		
		int largest=arr[0];
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
				
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		
	}

}
