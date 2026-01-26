package JavaPractise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2,3,4,5,8,9};
		int arr2[]= {4,5,6,11,12,13};
		
		int len=arr1.length;
		int len1=arr1.length;
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<=len-1;i++)
		{
			for(int j=0;j<=len1-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					set.add(arr1[i]);
					
				}
			}
		}
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
		int element=it.next();
		System.out.println(element);
		}
		

	}

}
