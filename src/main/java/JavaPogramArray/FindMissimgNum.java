package JavaPogramArray;

public class FindMissimgNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[]= {1,2,3,4,6};
		int arr2[]= {1,2,3,4,5,6};
		int sum=0;
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			sum=sum+arr1[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<=arr2.length-1;i++)
		{
			sum1=sum1+arr2[i];
		}
		System.out.println(sum1);
		
		int missingNumber=sum1-sum;
		System.out.println(missingNumber);
	}

}
