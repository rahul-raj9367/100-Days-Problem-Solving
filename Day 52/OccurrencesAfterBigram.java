
/*
Given two strings first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

Return an array of all the words third for each occurrence of "first second third".

Example 1:
Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]
Example 2:
Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]
*/
import java.util.*;
class OccurrencesAfterBigram{
	static String[] findOccurrencesAfterBigram(String text,String first,String second){
		List<String> list=new ArrayList<>();
		String words[]=text.split(" ");
		for(int i=0;i<words.length;i++){
			if(words[i].equals(first) && words[i+1].equals(second)){
				list.add(words[i+2]);
			}
		}

		return list.toArray(new String[0]);
	}
	public static void main(String[] args) {
		String text = "alice is a good girl she is a good student", first = "a", second = "good";
		
		String ans[]=findOccurrencesAfterBigram(text,first,second);
		for(String val:ans){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
girl student
*/