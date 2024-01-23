/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
*/
class ClimbingStairs{
	static int findClimbingStairs(int n){
		int a=0,b=1,c;

		for(int i=0;i<n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	public static void main(String[] args) {
		int n=6;

		System.out.println(findClimbingStairs(n));
	}
}
/*
OUTPUT
13
*/