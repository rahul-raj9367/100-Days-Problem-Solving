/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.


Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
*/
class FindWordsThatCanBeFormedbyCharacters{
	static int findWordsThatCanBeFormedbyCharacters(String[] words,String chars){
		// int ans=0;
        // for(String word:words){
        //     int length=0;
        //     for(char ch:word.toCharArray()){
        //         if(chars.indexOf(ch)!=-1){
        //             length+=1;
        //         }
        //     }
        //     if(word.length()==length){
        //         ans+=word.length();
        //     }
        // }
        // return ans;
        int ans=0;
        for(String word:words){
        	int charCount[]=new int[26];
        	boolean sts=true;
        	for(char c:chars.toCharArray()){
        		charCount[c-'a']++;
        	}

        	for(char ch:word.toCharArray()){
        		if(--charCount[ch-'a']<0){
        			sts=false;
        			break;
        		}
        	}
        	if(sts){
        		ans+=word.length();
        	}
        }

        return ans;

	}
	public static void main(String[] args) {
		String words[]={"cat","bt","hat","tree"};
		String chars = "atach";
		System.out.println(findWordsThatCanBeFormedbyCharacters(words,chars));
	}
}
/*
OUTPUT
6
*/