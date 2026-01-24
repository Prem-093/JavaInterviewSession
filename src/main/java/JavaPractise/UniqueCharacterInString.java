package JavaPractise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Selenium";
		
		char chArr[]=s.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		int count=0;
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
		
		System.out.println(map.keySet());
		
	}

}
