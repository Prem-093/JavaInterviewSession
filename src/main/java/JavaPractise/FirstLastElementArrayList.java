package JavaPractise;

import java.util.ArrayList;

public class FirstLastElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Prem");
		list.add("Prakash");
		list.add("Mani");
		list.add("Tripathi");
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		

	}

}
