package JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepetativeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="FindFirstNonRepetativeChar";
		
		char charr[]=s.toCharArray();
		
		int count=1;
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(char c:charr)
		{
			if(map.containsKey(c)) {
			
				map.put(c, count+1);
			}
			else
			{
				map.put(c, count);
			}
		}
		
		Iterator<Character> it=	map.keySet().iterator();
		
		while(it.hasNext())
		{
			Character key=it.next();
			
			if(map.get(key)==1)
			{
				System.out.println("Character ="+key+":"+map.get(key));
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
