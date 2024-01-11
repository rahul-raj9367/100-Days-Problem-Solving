/*
Given an array Arr[] that contains N integers (may be positive, negative or zero). 
Find the product of the maximum product subarray.

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
*/
class MaximumProductSubarray{
    static long findMaximumProductSubarray(int n,int arr[]){
        long pre=1;
        long suff=1;
        long ans=Long.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }
            if(suff==0){
                suff=1;
            }

            pre=pre*arr[i];
            suff=suff*arr[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
	public static void main(String[] args) {
		int n=5;
		int arr[]={6, -3, -10, 0, 2};
        long result = findMaximumProductSubarray(n,arr);
        System.out.println(result);
	}
}
/*
OUTPUT
180
*/
