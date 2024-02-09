/*
Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

You may assume the input array always has a valid answer.
 

Example 1:
Input: nums = [1,5,1,1,6,4]
Output: [1,6,1,5,1,4]
Explanation: [1,4,1,5,1,6] is also accepted.

Example 2:
Input: nums = [1,3,2,2,3,1]
Output: [2,3,1,3,1,2]
*/
import java.util.*;
class WiggleSortII{
	public static void main(String[] args) {
		int arr[]={1,3,2,2,3,1};
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
		int n=arr.length-1;
		

		for(int i=1;i<arr.length;i+=2){
			temp[i]=arr[n--];
		}
		for(int i=0;i<arr.length;i+=2){
			temp[i]=arr[n--];
		}

		for(int i=0;i<arr.length;i++){
			arr[i]=temp[i];
		}

		for(int val:arr){
			System.out.print(val+" ");
		}

	}
}
/*
OUTPUT
2 3 1 3 1 2
*/