/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 
*/
import java.util.*;
class ValidAnagram{
	static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s,t));
	}
}
/*
OUTPUT
true
*/