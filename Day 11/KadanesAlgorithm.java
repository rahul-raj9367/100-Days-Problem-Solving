/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) 
which has the maximum sum and return its sum.

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
*/
class KadanesAlgorithm{
	static long findKadanesAlgorithm(int arr[],int n){
		long max=arr[0];
		long maxref=arr[0];

		for(int i=1;i<n;i++){
			max=Math.max(arr[i],max+arr[i]);
			maxref=Math.max(maxref,max);
		}
		return maxref;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,-2,5};
		int n=5;

		// long max=Long.MIN_VALUE;
		// long sum=0;

		// for(int i=0;i<n;i++){
		// 	sum+=arr[i];

		// 	if(sum>max){
		// 		max=sum;
		// 	}

		// 	if(sum<0){
		// 		sum=0;
		// 	}
		// }
		long sum = findKadanesAlgorithm(arr,n);
		System.out.println(sum);


	}
} 
/*
OUTPUT
9
*/