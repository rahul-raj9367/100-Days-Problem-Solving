/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false
*/
class RotateString{
	static boolean findRotateString(String s,String goal){
		if(s==null || goal==null || s.length()!=goal.length()){
			return false;
		}
		String combine=s+s;
		return combine.contains(goal);
	}
	public static void main(String[] args) {
		String s="abcde", goal = "cdeab";
		System.out.println(findRotateString(s,goal));
	}
}
/*
OUTPUT
true
*/