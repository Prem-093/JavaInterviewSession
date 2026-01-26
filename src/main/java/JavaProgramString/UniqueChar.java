package JavaProgramString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="selenium";
		
		char charArr[]=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int count=0;
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
			char  key=it.next();
			
			System.out.println("Uniuqe char:"+key);	
		}
		
	}

}
