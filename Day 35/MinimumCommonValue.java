/*
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.

Example 2:
Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
*/
import java.util.*;
class MinimumCommonValue{
	static int findMinimumCommonValue(int arr1[],int arr2[]){

		//brute force
		// int ans=Integer.MAX_VALUE; 
		// for(int i=0;i<arr1.length;i++){
		// 	for(int j=0;j<arr2.length;j++){
		// 		if(arr1[i]==arr2[j]){
		// 			ans=Math.min(ans,arr1[i]);
		// 		}
		// 	}
		// }
		// return (ans==Integer.MAX_VALUE)?-1:ans;

		//better
		// HashSet<Integer> set= new HashSet<>();
		// int ans=Integer.MAX_VALUE; 
		// for(int num:arr1){
		// 	set.add(num);
		// }

		// for(int num:arr2){
		// 	if(set.contains(num)){
		// 		ans=Math.min(ans,num);
		// 	}
		// }
		// return (ans==Integer.MAX_VALUE)?-1:ans;

		//optimized
		//binary search
		int ans=Integer.MAX_VALUE; 
		for(int num:arr1){
			if(binarySearch(arr2,num)){
				ans=Math.min(ans,num);
			}
		}
		return (ans==Integer.MAX_VALUE)?-1:ans;
	}
	static boolean binarySearch(int arr[],int target){
		int low=0,high=arr.length-1;

		while(low<=high){
			int mid=(low+high)/2;

			if(arr[mid]==target){
				return true;
			}else if(target>arr[mid]){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr1[]={1,2,3};
		int arr2[]={2,3,4,5};
		System.out.println(findMinimumCommonValue(arr1,arr2));
	}
}
/*
OUTPUT
2
*/