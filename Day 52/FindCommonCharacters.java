/*
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 
Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]
*/
import java.util.*;
class FindCommonCharacters{
	static List<String> commonChars(String[] words) {
      List<String> list=new ArrayList<>();
      int minfreq[]=new int[26];
      for(int i=0;i<26;i++){
        minfreq[i]=Integer.MAX_VALUE;
      }

      for(String word:words){
        int freq[]=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            minfreq[i]=Math.min(minfreq[i],freq[i]);
        }
      }

      for(char c='a';c<='z';c++){
        while(minfreq[c-'a']-->0){
            list.add(String.valueOf(c));
        }
      }
      return list;
    }
	public static void main(String[] args) {
		String words[] = {"bella","label","roller"};
		System.out.println(commonChars(words));
	}
}
/*
OUTPUT
[e, l, l]
*/