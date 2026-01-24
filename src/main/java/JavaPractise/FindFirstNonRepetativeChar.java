package JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepetativeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="FindFirstNonRepetativeChar";
		
		char charArr[]=s.toCharArray();
		
		int count=1;
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(char e:charArr)
		{
			if(map.containsKey(e))
			{
				map.put(e, count+1);
			}
			else
			{
				map.put(e, count);
			}
		}
		
		
		Iterator<Character> it=map.keySet().iterator();
		
		while(it.hasNext())
		{
			Character ch=it.next();
			
			if(map.get(ch).equals(1))
			{
				System.out.println("First non repetativechar :"+ch);
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
