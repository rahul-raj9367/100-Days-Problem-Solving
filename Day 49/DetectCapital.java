/*
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.


Example 1:
Input: word = "USA"
Output: true
Example 2:
Input: word = "FlaG"
Output: false
*/
class DetectCapital{
	static boolean findDetectCapital(String s){
		if(s.length()<=1){
			return true;
		}
		char first=s.charAt(0);
		boolean sts=true;
		if(Character.isLowerCase(first)){
			for(int i=1;i<s.length();i++){
				if(Character.isUpperCase(s.charAt(i))){
					sts=false;
					break;
				}
			}
		}else if(Character.isUpperCase(first) && Character.isLowerCase(1)){
			for(int i=2;i<s.length();i++){
				if(Character.isUpperCase(s.charAt(i))){
					sts=false;
					break;
				}
			}
		}else{
			for(int i=1;i<s.length();i++){
				if(Character.isLowerCase(s.charAt(i))){
					sts=false;
					break;
				}
			}
		}
		return sts;
	}
	public static void main(String[] args) {
		String s="USA";
		System.out.println(findDetectCapital(s));
	}
}
/*
OUTPUT
true
*/