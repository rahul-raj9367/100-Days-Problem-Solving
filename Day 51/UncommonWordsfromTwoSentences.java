/*
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
*/
import java.util.*;
class UncommonWordsfromTwoSentences{
	static String[] findUncommonWordsfromTwoSentences(String s1,String s2){
		Map<String,Integer> map=new HashMap<>();

		String s[]=s1.split(" ");
		String ss[]=s2.split(" ");
		for(String word:s){
			map.put(word,map.getOrDefault(word,0)+1);
		}

		for(String word:ss){
			map.put(word,map.getOrDefault(word,0)+1);
		}

		List<String> list=new ArrayList<>();

		for(Map.Entry<String,Integer> enty :map.entrySet()){
			if(enty.getValue()==1){
				list.add(enty.getKey());
			}
		}

		return list.toArray(new String[0]);
	}
	public static void main(String[] args) {
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		String ans[]=findUncommonWordsfromTwoSentences(s1,s2);
		for(String a:ans){
			System.out.print(a+" ");
		}
	}
}
/*
OUTPUT
sweet sour
*/