/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"
 
*/
class ToLowerCase{
	static String toLowerCase(String s) {
        return s.toLowerCase();
    }
	public static void main(String[] args) {
		String s="Hello";
		System.out.println(toLowerCase(s));
	}
}
/*
OUTPUT
hello
*/