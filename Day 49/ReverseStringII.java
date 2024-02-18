/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:
Input: s = "abcd", k = 2
Output: "bacd"
*/
import java.util.*;
class ReverseStringII{
	static String findReverseStringII(String s,int k){
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<s.length();i+=k+2){
			int start=i;
			int end=Math.min(i+k-1,s.length()-1);
			swap(sb,start,end);
		}
		return sb.toString();
	}
	static void swap(StringBuilder sb,int i,int j){
		while(i<j){
			char temp=sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
			i++;
			j--;
		}
		// StringBuilder sb = new StringBuilder("hello");
		//sb.setCharAt(1, 'X'); // Sets the character at index 1 to 'X'
	}
	public static void main(String[] args) {
		String s="abcdefg";
		int k=2;
		System.out.println(findReverseStringII(s,k));
	}
}
/*
OUTPUT
bacdfeg
*/