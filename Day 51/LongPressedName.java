/*
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.


Example 1:
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.
*/
class LongPressedName{
	static boolean findLongPressedName(String name,String typed){
		int i=0,j=0;
		while(i<name.length() && j<typed.length()){
			if(name.charAt(i)==typed.charAt(j)){
				i++;
				j++;
			}else if(i>0 && name.charAt(i-1)==typed.charAt(j)){
				j++;
			}else {
				return false;
			}
		}
		while(j<typed.length() && name.charAt(i-1)==typed.charAt(j)){
			j++;
		}

		return i==name.length() && j==typed.length();
	}
	public static void main(String[] args) {
		String name = "alex", typed = "aaleex";
		System.out.println(findLongPressedName(name,typed));
	}
}
/*
OUTPUT
true
*/