package JavaPractise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= {2,3,3,4,6,7,7,8};
		String str="HI java java prem";
		String s[]=str.split(" ");
		//String arr[]= {"Prem","Prem","Tripthi"};
		Set<String> set=new HashSet<String>();
       
		for(String e:s)
		{
			if(!set.add(e))
			{
				System.out.println(e);
			}
		}
		
	}

}
