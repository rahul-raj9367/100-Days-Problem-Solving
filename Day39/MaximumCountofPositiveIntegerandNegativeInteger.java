/*
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
*/
class MaximumCountofPositiveIntegerandNegativeInteger{
	static int findposandneg(int arr[]){
		int pos=0,neg=0,ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				pos=0;
			}else if(arr[i]>0){
				pos++;
			}else{
				neg++;
			}
		}
		ans=Math.max(ans,Math.max(pos,neg));
		return ans;
	}
	public static void main(String[] args) {
		int arr[]={-3,-2,-1,0,0,1,2};
		System.out.println(findposandneg(arr));
	}
}
/*
OUTPUT
3
*/