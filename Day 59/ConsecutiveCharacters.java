/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

 

Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
*/
class ConsecutiveCharacters{
	static int findConsecutiveCharacters(String s){
		int ans=0;
		int k=0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)) k++;
			else k=0;
			ans=Math.max(ans,k);
		}
		return Math.max(ans,k)+1;
	}
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(findConsecutiveCharacters(s));
	}
}
/*
OUTPUT
2
*/