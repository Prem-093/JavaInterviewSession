package JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Count Duplicate Duplicate Word";
		
		String atrArr[]=str.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		int count=1;
		
		for(String e:atrArr)
		{
			if(map.containsKey(e))
				
			{
				map.put(e,count+1);
			}
			else
			{
				map.put(e, count);
			}
		}
		
		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext())
		{
		String key=	it.next();
		
		System.out.println("Count of Duplicate word="+key+":"+map.get(key));
		}
	

}
}

