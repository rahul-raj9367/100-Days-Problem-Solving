/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
*/
class BackspaceStringCompare{
	static boolean findBackspaceStringCompare(String s,String t){
		return processString(s).equals(processString(t));
	}
	static String processString(String s){
		StringBuilder sb= new StringBuilder();
		for(char c:s.toCharArray()){
			if(c=='#'){
				if(sb.length()>0){
					sb.deleteCharAt(sb.length()-1);
				}
			}else{
				sb.append(c);
			}
		}
		return  sb.toString();
	}
	public static void main(String[] args) {
		String s = "ab##", t = "c#d#";
		System.out.println(findBackspaceStringCompare(s,t));
	}
}
/*
OUTPUT
true
*/