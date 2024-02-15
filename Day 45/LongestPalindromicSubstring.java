/*
Given a string s, return the longest 
palindromic substring in s.


Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input: s = "cbbd"
Output: "bb"
*/
class LongestPalindromicSubstring{
	static String findLongestPalindromicSubstring(String s){
		if(s.length()<=1){
			return s;
		}
		String maxStr=s.substring(0,1);
		for(int i=0;i<s.length();i++){
			String odd=expandFromcenter(s,i,i);
			String even=expandFromcenter(s,i,i+1);

			if(odd.length()>maxStr.length()){
				maxStr=odd;
			}
			if(even.length()>maxStr.length()){
				maxStr=even;
			}
		}
		return maxStr;
	}
	static String expandFromcenter(String s, int left,int right){
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}

		return s.substring(left+1,right);
	}
	public static void main(String[] args) {
		String s="babad";
		System.out.println(findLongestPalindromicSubstring(s));
	}
}
/*
OUTPUT
bab
*/
