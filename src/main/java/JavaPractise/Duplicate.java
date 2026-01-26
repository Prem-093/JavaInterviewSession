package JavaPractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[]= {"HI", "HAVA","HAVA","PREM"};
		
		Set set= new LinkedHashSet();
		
		for(String e:arr)
		{
			if(!set.add(e))
			{
				System.out.println(e);
			}
			
		}
		
	}

}
