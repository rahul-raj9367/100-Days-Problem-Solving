/*
Given a positive integer, N. Find the factorial of N. Using Recursion

Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
*/
class Factorial{
	static int findFactorial(int n){
		if(n==0 || n==1){
			return n;
		}
		return n*findFactorial(n-1);
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(findFactorial(n));
	}
}
/*
OUTPUT
120
*/
