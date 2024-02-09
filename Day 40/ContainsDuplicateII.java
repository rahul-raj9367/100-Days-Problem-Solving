/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/
import java.util.*;
class ContainsDuplicateII{
	 static boolean containsNearbyDuplicate(int[] nums, int k) {
        //  for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            
            set.add(nums[i]);
            
            // Maintain a window of size k by removing elements that are beyond the window
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
	public static void main(String[] args) {
		int nums[] = {1,2,3,1}, k = 3;
		System.out.println(containsNearbyDuplicate(nums,k));
	}
}
/*
output
true
*/