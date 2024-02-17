/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
*/
import java.util.*;
class KeyboardRow{
	static String[] findKeyboardRow(String s[]){

		String firstrow="qwertyuiop";
		String secondrow="asdfghjkl";
		String thirdrow="zxcvbnm";
		List<String> list=new ArrayList<>();

		for(String word:s){
			String lowerword=word.toLowerCase(); 
			int frow=0,srow=0,trow=0;
			for(char c:lowerword.toCharArray()){
				if(firstrow.indexOf(c)!=-1){
					frow++;
				}else if(secondrow.indexOf(c)!=-1){
					srow++;
				}else if(thirdrow.indexOf(c)!=-1){
					trow++;
				}
			}

			if(frow==lowerword.length() || srow==lowerword.length() || trow==lowerword.length()){
				list.add(word);
			}
		}

		return list.toArray(new String[0]);
	} 
	public static void main(String[] args) {
		String s[]={"Hello","Alaska","Dad","Peace"};
		String ans[]=findKeyboardRow(s);
		for(String w:ans){
			System.out.print(w+" ");
		}		
	}
}
/*
OUTPUT
Alaska Dad
*/