/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
*/
import java.util.*;
class SortCharactersByFrequency{
	static String findSortCharactersByFrequency(String s){
		int charCount[]=new int[128];

		for(char c:s.toCharArray()){
			charCount[c]++;
		}

		StringBuilder sortstring = new StringBuilder();
		while(sortstring.length()<s.length()){
			int maxCount=0;
			char maxChar=0;

			for(int i=0;i<charCount.length;i++){
				if(charCount[i]>maxCount){
					maxCount=charCount[i];
					maxChar=(char)i;
				}
			}

			for(int i=0;i<maxCount;i++){
				sortstring.append(maxChar);
			}

			charCount[maxChar]=0;
		}

		return sortstring.toString();
	}
	public static void main(String[] args) {
		String s="tree";
		System.out.println(findSortCharactersByFrequency(s));
	}
}
/*
OUTPUT
eert
*/