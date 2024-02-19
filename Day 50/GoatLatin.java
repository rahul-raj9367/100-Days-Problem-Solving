/*
You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
For example, the word "apple" becomes "applema".
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
Return the final sentence representing the conversion from sentence to Goat Latin.

 

Example 1:

Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
*/
import java.util.*;
class GoatLatin{
	static String findGoatLatin(String s){
		StringBuilder sb=new StringBuilder();
		String vowels="aeiouAEIOU";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++){
			String word=arr[i]; 
			StringBuilder find=new StringBuilder();
			if(i>0){
				find.append(" ");
			}
			if(vowels.indexOf(word.charAt(0))!=-1){
				find.append(word);
			}else{
				find.append(word.substring(1));
				find.append(word.charAt(0));
			}
			find.append("ma");
			find.append("a".repeat(i+1));
			
			sb.append(find);

		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String sentence = "I speak Goat Latin";
		System.out.println(findGoatLatin(sentence));
	}
}
/*
OUTPUT
Imaa peaksmaaa oatGmaaaa atinLmaaaaa
*/