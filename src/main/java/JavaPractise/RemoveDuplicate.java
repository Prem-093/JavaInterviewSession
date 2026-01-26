package JavaPractise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to to java java world";
		
		String str[]=s.split("\\s");
		
		Set<String> set=new LinkedHashSet<String>();
		
		String OrginalWord="";
		
		for(String word:str)
			
		{
			set.add(word);
		}
		
		//System.out.println(set);
		
		Iterator<String> it=set.iterator();
		
		//System.out.println(it.next() + " ");
		
		while (it.hasNext())
		{
			String nonDuplicateword=it.next();
			OrginalWord=OrginalWord + nonDuplicateword +" ";
		}
				System.out.println(OrginalWord);
	}
	

}
