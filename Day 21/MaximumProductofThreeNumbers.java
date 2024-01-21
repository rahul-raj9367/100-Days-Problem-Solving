/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6

Example 2:
Input: nums = [1,2,3,4]
Output: 24

Example 3:
Input: nums = [-1,-2,-3]
Output: -6
*/
class MaximumProductofThreeNumbers{
	static int findMaximumProductofThreeNumbers(int arr[]){
		int max=Integer.MIN_VALUE;
		int product=1;

		for(int i=0;i<arr.length-2;i++){
			int j=i+1;
			int last=arr.length-1;
			while(j<last){
				product=arr[i]*arr[j]*arr[last];
				max=Math.max(max,product);
				if(product<0){
					j++;
				}else{
					last--;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		
		System.out.println(findMaximumProductofThreeNumbers(arr));

	}
}
/*
OUTPUT
24
*/