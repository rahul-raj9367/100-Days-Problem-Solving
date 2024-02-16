/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/
class ReverseString{
	static String findReverseString(char ch[]){
		int i=0,j=ch.length-1;
		while(i<j){
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		char ch[]={'h','e','l','l','o'};
		System.out.println(findReverseString(ch));
	}
}
/*
OUTPUT
olleh
*/