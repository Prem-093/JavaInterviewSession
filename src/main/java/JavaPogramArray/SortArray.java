package JavaPogramArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"Prem","Tripathi","Boy","Apple"};
		
		List<String> list=Arrays.asList(arr);
	
		ArrayList<String> arrList=new ArrayList<String>(list);
		
	System.out.println(arrList);
	Collections.sort(arrList);
	System.out.println(arrList);
	}

}
