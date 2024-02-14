/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
*/
class RearrangeArrayElementsbySign{
	static int[] findRearrangeArrayElementsbySign(int arr[]){
		int pos[]=new int[arr.length/2];
		int neg[]=new int[arr.length/2];
		int ans[]=new int[arr.length];

		int p=0,n=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				pos[p++]=arr[i];
			}else{
				neg[n++]=arr[i];
			}
		}

		for(int i=0;i<arr.length/2;i++){
			ans[2*i]=pos[i];
			ans[2*i+1]=neg[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]={3,1,-2,-5,2,-4};
		int ans[]=findRearrangeArrayElementsbySign(arr);

		for(int val:ans){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
3 -2 1 -5 2 -4
*/