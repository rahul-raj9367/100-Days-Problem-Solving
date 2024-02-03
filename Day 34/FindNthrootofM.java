/*
You are given 2 numbers (n , m); the task is to find n√m (nth root of m).

Example 1:
Input: n = 2, m = 9
Output: 3
Explanation: 32 = 9

Example 2:
Input: n = 3, m = 9
Output: -1
Explanation: 3rd root of 9 is not
integer.
*/
class FindNthrootofM{
	static int findNthrootofM(int n,int m){
		int low=1,high=m;
		while(low<=high){
			int mid=(low+high)/2;
			int f=helper_Fun(mid,n);
			if(f==m) return mid;
			else if(f<m) {
				low=mid+1;
			}else{
				high=mid+1;
			}
		}
		return -1;
	}
	static int helper_Fun(int mid,int n){
		// if(n==0){
		// 	return 1;
		// }
		// if(n%2==0){
		// 	int result=helper_Fun(mid,n/2);
		// 	return result*result;
		// }else{
		// 	return helper_Fun(mid,n-1)*mid;
		// }
		int result=(int)Math.pow(mid,n);
		return result;
	}
	public static void main(String[] args) {
		int n=2,m=9;
		System.out.println(findNthrootofM(n,m));
	}
}
/*
OUTPUT
3
*/