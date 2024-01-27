/*
Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Input:
N = 12, R = 21
Output: 864354781
Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
*/
class PowerOfNumbers{
	static long findPowerOfNumbers(int n,int r){
		if(r==0){
			return 1;
		}
		if(r%2==0){
			long res=findPowerOfNumbers(n,r/2);
			return res*res % 1000000007;
		}else{
			return findPowerOfNumbers(n,r-1)*n % 1000000007;	
		}
	}
	public static void main(String[] args) {
		int n=12,r=21;
		System.out.println(findPowerOfNumbers(n,r));
	}
}
/*
OUTPUT
864354781
*/