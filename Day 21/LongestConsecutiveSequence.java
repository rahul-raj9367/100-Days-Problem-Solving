/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/
import java.util.*;
class LongestConsecutiveSequence{
	static int findLongestConsecutiveSequence(int arr[]){
		Arrays.sort(arr);
		int n=arr.length;
		int count=1;
		int i=1;
		int max=Integer.MIN_VALUE;
		while(i<n){
			int j=i-1;
			if(arr[i]-1==arr[j]){
				count++;
			} else if(arr[i]!=arr[j]){
				count=1;
			}
			i++;
			max=Math.max(max,count);
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]={100,4,200,1,3,2};
		System.out.println(findLongestConsecutiveSequence(arr));
	}
}
/*
OUTPUT
4
*/