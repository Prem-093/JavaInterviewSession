package LeetCodeDate02022026;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode9 {
	
	public static void getTotalVowelConsonent(String s)
	{
		int vowelcount=0;
		int ConsonentCount=0;
		char ch[]=s.toCharArray();
	
		
		
		for(int i=0;i<=ch.length-1;i++)
		{
			
			while(i<ch.length && ch[i]!=' ')
			{				
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				char s1=ch[i];
				System.out.println("Vowel :"+s1);
				vowelcount++;
			}
			else
			{
			char s1=ch[i];
				System.out.println("Consonent:"+ch[i]);
				ConsonentCount++;
			}
					i++;
			}
		}
		
		System.out.println("Total vowelcount:"+vowelcount);
		System.out.println("Total evencount:"+ConsonentCount);
		
		
		}
	
	public static int getWordCount(String name)
	{
		
		String stArr[]=name.split(" ");
		int count=0;
		for(int i=0;i<=stArr.length-1;i++)
		{
			String s2=stArr[i];
			count++;
		}
		return count;
	}
	
	public static void getCharCount(String NameChar)
	{
		
		
		char[] ch=NameChar.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		int count=1;
		
		for(char e:ch)
		{
			if(!String.valueOf(e).isBlank())
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
		}
		
		
		Iterator<Character> it=map.keySet().iterator();
		
		while(it.hasNext())
		{
			char ch1=it.next();
			System.out.println(ch1+","+map.get(ch1));
		}
		
	}
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getTotalVowelConsonent("Prem Prakash Mani Tripathi");
		
		//int totalcount=getWordCount("Prem Prakash Mani Tripathi");
		//System.out.println(totalcount);
		//int cont=getCharCount("Prem Prakash Mani Tripathi");
		//System.out.println(cont);
		getCharCount("Prem Prakash Mani Tripath");
		

	}
}


