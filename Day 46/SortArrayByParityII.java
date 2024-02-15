/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

 

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:
Input: nums = [2,3]
Output: [2,3]
*/
class SortArrayByParityII{
	static int[] findSortArrayByParityII(int nums[]){
		int even[]=new int[nums.length/2];
       int odd[]=new int[nums.length/2];
       int ans[]=new int[nums.length];
        int e=0,o=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
               even[e++]=nums[i];
           }else{
               odd[o++]=nums[i];
           }
       }

       for(int i=0;i<nums.length/2;i++){
           ans[2*i]=even[i];
           ans[2*i+1]=odd[i];
       }

       return ans;
	}
	public static void main(String[] args) {
		int arr[]={4,2,5,7};
		int ans[]=findSortArrayByParityII(arr);
		for(int val:ans){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
4 5 2 7
*/