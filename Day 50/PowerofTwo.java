/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
*/
class PowerofTwo{
	static boolean findPowerofTwo(int n){
		// for(int i=0;i<=n;i++){
        //     if(Math.pow(2,i)==n){
        //         return true;
        //     }
        // }
        // return false;
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
	}
	public static void main(String[] args) {
		int n=16;
		System.out.println(findPowerofTwo(n));
	}
}
/*
OUTPUT
true
*/