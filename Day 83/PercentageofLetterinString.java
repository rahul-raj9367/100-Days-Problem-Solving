/*
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

Example 1:
Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.


Example 2:
Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
*/
class PercentageofLetterinString{
	static int findPercentageofLetterinString(String s,char c){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c){
				count++;
			}
		}

		return (int)(count * 100) / s.length();
	}
	public static void main(String[] args) {
		String s = "foobar";
		char letter = 'o';
		System.out.println(findPercentageofLetterinString(s,letter));
	}
}
/*
OUTPUT
33
*/