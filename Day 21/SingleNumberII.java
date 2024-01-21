/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,3,2]
Output: 3

Example 2:
Input: nums = [0,1,0,1,0,1,99]
Output: 99
*/
import java.util.*;
class SingleNumberII{
	static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int count=3;
        for(int val:nums){
            if(map.get(val)<count){
                ans=val;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int arr[]={2,2,3,2};
		System.out.println(singleNumber(arr));
	}
}
/*
OUTPUT
3
*/