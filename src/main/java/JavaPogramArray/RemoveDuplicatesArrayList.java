package JavaPogramArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Prem");
		list.add("Prem");
		list.add("Love");
		list.add("light");
		
		Set<String> set=new HashSet<String>(list);
		
		System.out.println(set);
		
		
		
		
	}

}
