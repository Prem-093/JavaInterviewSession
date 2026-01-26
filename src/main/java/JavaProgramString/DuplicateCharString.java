package JavaProgramString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Selenium";
		
		char chArr[]=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>()	;
		int count=1;
		
		for(char e:chArr)
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
			Character key=it.next();
			System.out.println("Num of repeated char:"+key+"="+map.get(key));
			
			if(map.get(key)>1)
			{
				System.out.println("Duplicate Char:"+key+"="+map.get(key));
				break;
			}
		}
		
	}

}
