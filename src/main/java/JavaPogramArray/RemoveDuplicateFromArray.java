package JavaPogramArray;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String strArr[]= {"Prem","Tripathi","Prem","Selenium","Java"};
		
		Set<String> set=new HashSet<String>();
		
		for(String e:strArr)
		{
			if(!set.contains(e))
			{
				set.add(e);
			}
		}
		java.util.Iterator<String> it=	set.iterator();
		
		
		while(it.hasNext())
		{
			 String key=it.next();
				System.out.println(key);
		}
	

	}

}
