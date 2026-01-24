package JavaPractiseInterview;

import java.util.HashMap;
import java.util.Iterator;

public class CountCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Selenium";
		
		char chArr[]=s.toCharArray();
		int count=1;
		
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
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
			
	Iterator<Character> it=	map.keySet().iterator();
	
	while(it.hasNext())
	{
		Character key=it.next();
		
		System.out.println(key+":"+ map.get(key));
	}
		
	}

}
