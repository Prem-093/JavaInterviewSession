package JavaPogramArray;

import java.util.ArrayList;

public class FirstAndLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Prem");
		list.add("prakash");
		list.add("mani");
		list.add("tripathi");
		
		System.out.println(list.get(0));
		System.out.println(list.size()-1);
		System.out.println(list.get(3));

	}

}
