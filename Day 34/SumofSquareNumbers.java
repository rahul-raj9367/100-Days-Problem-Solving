/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
 
Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:
Input: c = 3
Output: false
*/
class SumofSquareNumbers{
	static boolean findSumofSquareNumbers(int c){
		//brute force
		// int sum=0;
		// int ans=1;
		// for(int i=0;i<=c;i++){
		// 	ans=i*i;
		// 	sum+=ans;
		// 	if(sum==c){
		// 		return true;
		// 	}
		// }
		// return false;

		int low=0,high=(int)Math.sqrt(c);
		while(low<=high){
			int ans=low*low+high*high;
			if(ans==c){
				return true;
			}else if(ans<c){
				low++;
			}else{
				high--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int c=5;
		System.out.println(findSumofSquareNumbers(c));
	}
}
/*
OUTPUT
true
*/