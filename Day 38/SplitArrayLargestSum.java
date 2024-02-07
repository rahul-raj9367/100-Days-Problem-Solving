/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

Example 1:
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

Example 2:
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 
*/
class SplitArrayLargestSum{
	public static int findPages(int[]arr,int N,int M)
    {
        //Your code here
        if(M>N){
            return -1;
        }
        int ans=Integer.MIN_VALUE;
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        
        int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int noofstudent=findStudent(arr,mid);
            if(noofstudent>M){
                low=mid+1;
                ans=mid;
            }else{
                high=mid-1;
            }
        }
        // return (ans==Integer.MIN_VALUE)?-1:ans;
        return low;
    }
    static int findStudent(int arr[],int pages){
        int student=1,pageStudent=0;
        for(int i=0;i<arr.length;i++){
            if(pageStudent+arr[i]<=pages){
                pageStudent+=arr[i];
            }else{
                student++;
                pageStudent=arr[i];
            }
        }
        return student;
        
    }
    static int splitArray(int[] nums, int k) {
        int n=nums.length;
        return findPages(nums,n,k);
    }
	public static void main(String[] args) {
		int arr[] = {7,2,5,10,8}, k = 2;
		System.out.println(splitArray(arr,k));
	}
}
/*
OUTPUT
18
*/