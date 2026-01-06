package JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hi java java i am learning";
		
		String strarr[]=str.split(" ");
		
		int count=1;
		int len=strarr.length;
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		/*
		 * for(int i=0;i<=len-1;i++) {
		 * 
		 * if(!map.containsKey(strarr[i])) { map.put(strarr[i], count); } else {
		 * map.put(strarr[i], count+1); }
		 */
			
			for(String e:strarr)
			{
				if(!map.containsKey(e))
				{
					map.put(e, count);
				}
				else
				{
					map.put(e, count+1);
				}
			}
			
			Iterator<String> it=map.keySet().iterator();
			
			while(it.hasNext())
			{
				String key=it.next();
				System.out.println(key +":"+map.get(key));
			}
     	}
		
		

}

