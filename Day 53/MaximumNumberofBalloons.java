/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:
Input: text = "nlaebolko"
Output: 1
Example 2:
Input: text = "loonbalxballpoon"
Output: 2

Example 3:
Input: text = "leetcode"
Output: 0
*/
class MaximumNumberofBalloons{
	static int findMaximumNumberofBalloons(String text){
		int freq[]=new int[26];
		for(char c:text.toCharArray()){
			freq[c-'a']++;
		}
		int min=freq[1];//b
		min=Math.min(min,freq[0]);//a
		min=Math.min(min,freq[11]/2);//l
		min=Math.min(min,freq[14]/2);//o
		min=Math.min(min,freq[13]);//n

		return min;
	}
	public static void main(String[] args) {
		String text = "nlaebolko";
		System.out.println(findMaximumNumberofBalloons(text));
	}
}
/*
OUTPUT
1
*/