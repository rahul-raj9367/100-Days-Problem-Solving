/*
Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

A substring is a contiguous sequence of characters within a string

 

Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.
*/
import java.util.*;
class  StringMatchinginanArray{
	static List<String> findStringMatchinginanArray(String words[]){
		List<String> list=new ArrayList<>();
		for (int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++){
				if(i==j) continue;

				if(words[j].contains(words[i])){
					list.add(words[i]);
					break;
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		String words[]={"mass","as","hero","superhero"};
		System.out.println(findStringMatchinginanArray(words));
	}
}
/*
OUTPUT
[as, hero]
*/