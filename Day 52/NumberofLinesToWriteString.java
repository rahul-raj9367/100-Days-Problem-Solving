/*
You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.

Return an array result of length 2 where:

result[0] is the total number of lines.
result[1] is the width of the last line in pixels.
 

Example 1:
Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.
Example 2:
Input: widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "bbbcccdddaaa"
Output: [2,4]
Explanation: You can write s as follows:
bbbcccdddaa  // 98 pixels wide
a            // 4 pixels wide
There are a total of 2 lines, and the last line is 4 pixels wide.
*/
class NumberofLinesToWriteString{
	static int[] findNumberofLinesToWriteString(int widths[],String s){
		int result[]=new int[2];
		int num_lines=1;
		int width=0;
		for(char c:s.toCharArray()){
			int char_lines=widths[c-'a'];
			if(char_lines+width>100){
				num_lines++;
				width=0;
			}
			width+=char_lines;
		}

		result[0]=num_lines;
		result[1]=width;
		return result;
	}
	public static void main(String[] args) {
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s = "abcdefghijklmnopqrstuvwxyz";
		int ans[]=findNumberofLinesToWriteString(widths,s);
		for(int val:ans){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
3 60
*/