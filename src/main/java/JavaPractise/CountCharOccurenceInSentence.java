package JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountCharOccurenceInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium";
		
	char ch[]=	s.toCharArray();
	int count=1;
	
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(char c:ch)
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
		Character key=it.next();
		
		System.out.println("Duplicate value count="+key+":"+map.get(key));
		
	}

	}

}
