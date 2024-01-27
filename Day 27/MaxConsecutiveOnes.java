/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
*/
class MaxConsecutiveOnes{
	static int findMaxConsecutiveOnes(int arr[]){
		int count=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				count++;
			}else{
				count=0;
			}
			max=Math.max(max,count);
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]={1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}
}
/*
OUTPUT
3
*/