/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted
*/
import java.util.*;
class IntersectionofTwoArrayssI{
	static int[] findIntersectionofTwoArrayssI(int nums1[],int nums2[]){
		// int f=findMid(arr1);
		// int s=findMid(arr2);
		// if(f==s){
		// 	return true;
		// }
		// return false;
		Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> result = new ArrayList<>();
        
        int prev = Integer.MIN_VALUE;
        
        for (int num : nums2) {
            if (binarySearch(nums1, num) && num != prev) {
                result.add(num);
                prev = num;
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
	}
	// static int findMid(int arr[]){
	// 	int low=0,high=arr.length-1;
	// 	int mid=(low+high)/2;
	// 	return arr[mid];
		
	// }
	static boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
	public static void main(String[] args) {
		int arr1[]={1,2,2,1};
		int arr2[]={2,2};
		int nn[]=findIntersectionofTwoArrayssI(arr1,arr2);
		for(int val:nn){
			System.out.print(val+" ");
		}
	}
}