package JavaPogramArray;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {4,5,6,8};
		int arr2[]= {3,5,9,4};
		
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
