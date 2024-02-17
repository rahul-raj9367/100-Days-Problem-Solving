/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:
Input: s = "aba"
Output: false
Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

*/
import java.util.*;
class RepeatedSubstringPattern{
	static boolean findRepeatedSubstringPattern(String s){
		int n=s.length();
		for(int len=1;len<=n/2;len++){
			if(n%len==0){
				String patten=s.substring(0,len);
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<n/len;i++){
					sb.append(patten);
				}
				if(s.equals(sb.toString())){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String s="abab";
		System.out.println(findRepeatedSubstringPattern(s));
	}
}
/*
OUTPUT
true
*/