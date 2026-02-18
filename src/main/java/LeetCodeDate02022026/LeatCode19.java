package LeetCodeDate02022026;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LeatCode19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Duplicate char from string
		
		String s="little";
		int count=1;
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), count+1);
			}
			else
			{
				map.put(s.charAt(i), count);
			}
			
			
		}
		
		Iterator<Character> it=map.keySet().iterator();
		while(it.hasNext())
		{
			Character ch=it.next();
			
			if(map.get(ch)>1)
			{
				System.out.println(ch+"->"+map.get(ch));
			}
		}

	}

}
