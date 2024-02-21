/*
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
Example 2:
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
Example 3:
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
*/
class BuddyStrings{
	static boolean findBuddyStrings(String s,String goal){
		if(s.length()!=goal.length()){
			return false;
		}
		int count=0;
		int diffreq[]=new int[2];
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=goal.charAt(i)){
				if(count++==2){
					return false;
				}
				diffreq[count-1]=i;
			}
		}

		if(count==0){
			int freq[]=new int[26];
			for(char c:ch){
				if(freq[c-'a']++>0){
					return true;
				}
			}
			return false;
		}

		return count==2 && ch[diffreq[0]]==goal.charAt(diffreq[1]) && ch[diffreq[1]]==goal.charAt(diffreq[0]);
	}
	public static void main(String[] args) {
		String s = "ab", goal = "ba";
		System.out.println(findBuddyStrings(s,goal));
	}
}