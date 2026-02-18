package LeetCodePractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharInDescendingOrderbasedOnFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//b=1
		//a=3
		//n=2
		
		String s="banana";
		
		char ch[]=s.toCharArray();
		
		int count=0;
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char e:ch)
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
		
		List<Character>[] buckets=new List[ch.length];
		System.out.println(ch.length);
		
		for(int i=0;i<=buckets.length-1;i++)
		{
			buckets[i]=new ArrayList<>();
		}
		
		for(Character i :map.keySet())
		{
			buckets[map.get(i)].add(i);
		}
		System.out.println(buckets);
		
		ArrayList<Integer> temp=new ArrayList();
		 StringBuilder result = new StringBuilder();
		for(int i=buckets.length-1;i>=0;i--)
		{
			List<Character> list=buckets[i];
			for(int j:list)
			{
			
			temp.add(j);
			 
			}
			
			
		}
		
		
		
		for(Integer e:temp)
			
		{
			result.append((char)e.intValue());
		}
		
		
		System.out.println(":"+result);
		
		
		
	/*	Set<Entry<Character,Integer>> set=map.entrySet();
		
		List<Entry<Character,Integer>> list=new ArrayList<Entry<Character,Integer>>();
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>(){
				public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
            // For descending order, compare the second entry (frequency) to the first
            return entry2.getValue().compareTo(entry1.getValue());
            // For a tie-breaker (same frequency), you could add a comparison for characters here.			{
			
				}	}
				);
		
		System.out.println("Characters in descending order of frequency:");
        for (Map.Entry<Character, Integer> entry : list) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            // Print the character repeatedly based on its frequency
            for (int i = 0; i < frequency; i++) {
                System.out.print(character);
            }
        }
        System.out.println();
    }*/
		
		
		
	}
}


