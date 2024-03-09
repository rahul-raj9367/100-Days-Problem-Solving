/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/
import java.util.*;
class FindAllNumbersDisappearedinanArray{
	static List<Integer> findAllNumbersDisappearedinanArray(int nums[]){
		List<Integer> list=new ArrayList<>();
		int arr[]=new int[nums.length+1];
		for(int i=0;i<nums.length;i++){
			arr[nums[i]]=1;
		}

		for(int i=1;i<nums.length;i++){
			if(arr[i]==0){
				list.add(i);
			}
		}
		return list;
	} 
	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findAllNumbersDisappearedinanArray(nums));
	}
}