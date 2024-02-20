/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
*/
import java.util.*;
class LongestPalindrome{
	static int findLongestPalindrome(String s){
		Map<Character,Integer> map=new HashMap<>();
		for(char c:s.toCharArray()){
			map.put(c,map.getOrDefault(c,0)+1);
		}
		int length=0;
		boolean oddcount=false;
		for(int c:map.values()){
			if(c%2==0){
				length+=c;
			}else{
				length+=c-1;
				oddcount=true;
			}
		}

		if(oddcount){
			length++;
		}
		return length;

	}
	public static void main(String[] args) {
		String s="abccccdd";
		System.out.println(findLongestPalindrome(s));		
	}
}
/*
OUTPUT
7
*/