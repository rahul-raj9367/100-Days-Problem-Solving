/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Example 2:
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
*/
class PalindromicSubstrings{
	static int findPalindromicSubstrings(String s){
		int ans=0;
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				if(isPalidrome(s,i,j)){
					ans++;
				}
			}
		}
		return ans;
	}
	static boolean isPalidrome(String s,int i,int j){
		while(i<j){
			if(s.charAt(i++)!=s.charAt(j--)){
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		String s="abc";
		System.out.println(findPalindromicSubstrings(s));		
	}
}
/*
OUTPUT
3
*/