/*
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 

Example 1:
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.

Example 2:
Input: paragraph = "a.", banned = []
Output: "a"
*/
import java.util.*;
class MostCommonWord{
	static String findMostCommonWord(String paragraph,String banned[]){
		List<String> bannedword=Arrays.asList(banned);
		Map<String,Integer> map=new HashMap<>();
		paragraph=paragraph.toLowerCase().replaceAll("[^a-zA-Z]"," ");
		String s[]=paragraph.split("\\s+");
		int maxCount=0;
		String maxStr="";
		for(String word:s){
			if(!bannedword.contains(word)){
				int count=map.getOrDefault(word,0)+1;
				map.put(word,count);
				if(count>maxCount){
					maxCount=count;
					maxStr=word;
				}
			}
		}
		return maxStr;

	}
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String banned[] = {"hit"};
		System.out.println(findMostCommonWord(paragraph,banned));
	}
}
/*
OUTPUT
ball
*/