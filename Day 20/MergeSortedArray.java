/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
import java.util.*;
class MergeSortedArray{
	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int m = 3; 
		int nums2[] = {2,5,6};
		int n = 3;

		int nums3[]=new int[m+n];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                nums3[i]=nums1[i];
            }
        }
        for(int i=m;i<m+n;i++){
            nums3[i]=nums2[i-m];
        }

        Arrays.sort(nums3);
        for(int i=0;i<m+n;i++){
        	nums1[i]=nums3[i];
        }

        for(int val:nums1){
        	System.out.print(val+" ");
        }
        
	}
}
/*
OUTPUT
1 2 2 3 5 6
*/