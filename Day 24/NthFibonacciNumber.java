/*
Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Note: for the reference of this question take first fibonacci number to be 1.

Input: 
n = 2
Output: 
1 
Explanation: 
1 is the 2nd number of fibonacci series.
*/
class NthFibonacciNumber{
	// static int findNthFibonacciNumber(int n){
	// 	int mod=1000000007;
	// 	if(n<=1){
	// 		return n;
	// 	}
	// 	int fib[]=new int[n+1];
	// 	fib[0]=0;
	// 	fib[1]=1;

	// 	for(int i=2;i<=n;i++){
	// 		fib[i]=fib[n-1]+fib[n-2]%mod;
	// 	}

	// 	return fib[n];
	// }
	static int findNthFibonacciNumber(int n){
		if(n<=1){
			return n;
		}

		return findNthFibonacciNumber(n-1)+findNthFibonacciNumber(n-2);
	}
	public static void main(String[] args) {
		int n=2;
		System.out.println(findNthFibonacciNumber(n));
	}
}
/*
OUTPUT
1
*/
