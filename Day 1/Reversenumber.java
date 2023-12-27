/*
Given N,  reverse the digits of N

Input : 122
Output: 221
Explanation: By reversing the digits of 
number, number will change into 221.
*/

class Reversenumber{
	static int reverseNum(int n){//122
		int sum=0;
		while(n!=0){
			int r=n%10;
			sum=(sum*10)+r;//(22*10)+1=221
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=122;

		int result=reverseNum(num);
		System.out.println("Reversed Number: " + result);
	}
}
/*
OUTPUT
Reversed Number: 221
*/
