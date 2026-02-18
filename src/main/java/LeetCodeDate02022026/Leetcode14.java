package LeetCodeDate02022026;

import java.util.LinkedHashMap;
import java.util.Map;

public class Leetcode14 {
//Wrong way
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String compress=compress("aabbbc");
		System.out.println(compress);
    }

    public static String compress(String str) {
        // LinkedHashMap preserves the order of character insertion
        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        // Iterate through the input string to count character frequencies
        for (char c : str.toCharArray()) {
            // Using getOrDefault to simplify the counting logic
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder output = new StringBuilder();
        
        // Iterate over the map entries to build the output string
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            output.append(entry.getKey());
            output.append(entry.getValue());
        }

        return output.toString();

	}

}
