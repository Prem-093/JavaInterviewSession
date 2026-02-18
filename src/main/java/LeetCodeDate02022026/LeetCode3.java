package LeetCodeDate02022026;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="little";
		
	char chArr[]=	s.toCharArray();
	
	Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	int count=1;
	
	for(char c: chArr)
	{
		
		if(map.containsKey(c))
		{
			map.put(c, count+1);
		}
		else
		{
			map.put(c, count);
		}
	}
	
	Iterator<Character> it=map.keySet().iterator();
	
	while(it.hasNext())
	{
		char ch=it.next();
		//System.out.println(ch+":"+map.get(ch));
		
		if(map.get(ch)==1)
		{
			System.out.println("First non repetative char :"+ch);
			break;
		}
	}
	
		
		
		
		
		
	}

}
