/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
*/
import java.util.*;
class SetMismatch{
	static int[] findSetMismatch(int arr[],int n){
		int totalsum=n*(n+1)/2;
		int array_sum=0;
		int unique_sum=0;
		HashSet<Integer> set=new HashSet<>();
		for(int val:arr){
			array_sum+=val;
		}

		for(int val:arr){
			set.add(val);
		}

		for(int a:set){
			unique_sum+=a;
		}

		int missing=totalsum-unique_sum;
		int duplicate=array_sum-unique_sum;

		return new int[]{duplicate,missing};
	}
	public static void main(String[] args) {
		int arr[]={1,2,2,4};
		int n=arr.length;
		int ans[]=findSetMismatch(arr,n);

		for(int val:ans){
			System.out.print(val+" ");
		}






	}
}