package JavaPractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatefromArrayList {

	public static void main(String[] args) {
	
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Prem");
		list.add("Mani");
		list.add("Mani");
		list.add("Tripathi");
		System.out.println(list);
		
		Set<String> set=new LinkedHashSet<String>	(list);
		
		System.out.println(set);
		
		

	}

}
