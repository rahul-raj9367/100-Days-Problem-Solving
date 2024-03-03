/*
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).


Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Example 2:
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
*/
class CheckifAllCharactersHaveEqualNumberofOccurrences{
	static boolean findCheckifAllCharactersHaveEqualNumberofOccurrences(String s){
		int freq[]=new int[26];

		for(char c:s.toCharArray()){
			freq[c-'a']++;
		}

		int expectedcount=0;
		for(int count:freq){
			if(count!=0){
				if(expectedcount==0){
					expectedcount=count;
				}else if(expectedcount!=count){
					return false;
				}
			}
		}

		return true;

	}
	public static void main(String[] args) {
		String s = "abacbc";
		System.out.println(findCheckifAllCharactersHaveEqualNumberofOccurrences(s));
	}
}
/*
OUTPUT
true
*/
