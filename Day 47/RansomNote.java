/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true 
*/
class RansomNote{
	static boolean findRansomNote(String r,String m){
		int charCount[]=new int[26];
		for(char c:m.toCharArray()){
			charCount[c-'a']++;
		}

		for(char c:r.toCharArray()){
			if (charCount[c - 'a'] == 0) {
                return false; // Character not available in magazine
            }
            charCount[c - 'a']--; // Decrease the count yf character in magazine
		}
		return true;
	}
	public static void main(String[] args) {
		String ransomNote= "aa", magazine = "aab";
		System.out.println(findRansomNote(ransomNote,magazine));
	}
}
/*
OUTPUT
true
*/