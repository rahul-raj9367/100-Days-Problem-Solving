/*
Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.


Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:
Input: s = "Hello"
Output: 1
*/
class NumberofSegmentsinaString{
	static int findNumberofSegmentsinaString(String s){
		String ss[]=s.split(" ");
		int count=0;
		for(String word:ss){
			if(!word.isEmpty()){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s="Hello, my name is John";
		System.out.println(findNumberofSegmentsinaString(s));
	}
}
/*
OUTPUT
5
*/