/*
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.


Example 1:
Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.

Example 2:
Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.

Example 3:
Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.
*/
class GreatestEnglishLetterinUpperandLowerCase{
	static String findGreatestEnglishLetterinUpperandLowerCase(String s){
		for(int i='a';i<='z';i++){
			String lowerCase=Character.toString(i);
			String upperCase=Character.toString(i-32);
			if(s.contains(upperCase) && s.contains(lowerCase)){
				return upperCase;
			}
		}
		return "";
	}
	public static void main(String[] args) {
		String s="lEeTcOdE";
		System.out.println(findGreatestEnglishLetterinUpperandLowerCase(s));
	}
}