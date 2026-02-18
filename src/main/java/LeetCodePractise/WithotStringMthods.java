package LeetCodePractise;

import java.util.Scanner;

public class WithotStringMthods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.print("Enter full name: "); // e.g., Prem Mani Tripathi
        Scanner sc=new Scanner("dtfjyg");
        String input = sc.nextLine();
        
        // Convert to char array to avoid string methods like charAt()
        char[] chars = input.toCharArray();
        
        // Find the last space to identify the surname
        int lastSpaceIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                lastSpaceIndex = i;
            }
        }
        
        // 1. Process Initials for all words except the last
        boolean isFirstCharOfWord = true;
        for (int i = 0; i < lastSpaceIndex; i++) {
            if (chars[i] != ' ' && isFirstCharOfWord) {
                System.out.print(chars[i]);
                isFirstCharOfWord = false;
            } else if (chars[i] == ' ') {
                isFirstCharOfWord = true;
            }
        }
        
        // 2. Add space and print the full last name
        System.out.print(" ");
        for (int i = lastSpaceIndex + 1; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

	}


