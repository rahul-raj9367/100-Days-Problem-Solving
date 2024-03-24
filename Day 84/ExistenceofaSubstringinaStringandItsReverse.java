/*
Given a string s, find any 
substring
 of length 2 which is also present in the reverse of s.

Return true if such a substring exists, and false otherwise.

Example 1:

Input: s = "leetcode"

Output: true

Explanation: Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".


Example 2:
Input: s = "abcba"

Output: true

Explanation: All of the substrings of length 2 "ab", "bc", "cb", "ba" are also present in reverse(s) == "abcba".


Example 3:
Input: s = "abcd"

Output: false

Explanation: There is no substring of length 2 in s, which is also present in the reverse of s.
*/
class ExistenceofaSubstringinaStringandItsReverse{
	static boolean findExistenceofaSubstringinaStringandItsReverse(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev+=s.charAt(i);

		for(int i=0;i<s.length();i++){
			if(s.contains(rev.substring(i,i+2)))
				return true;
		}

		return false;
	}
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(findExistenceofaSubstringinaStringandItsReverse(s));
	}
}
/*
OUTPUT
true
*/