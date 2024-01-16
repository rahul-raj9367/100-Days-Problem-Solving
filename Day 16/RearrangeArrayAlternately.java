/*
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.
*/
class RearrangeArrayAlternately{
	public static void main(String[] args) {
		long arr[]={1,2,3,4,5,6};
		int n=6;

		long max[]=new long[n];
		long min[]=new long[n];

		for(int i=n-1;i>=n/2;i--){
			max[n-1-i]=arr[i];
		}

		for(int i=0;i<=n/2;i++){
			min[i]=arr[i];
		}

		arr[n-1]=arr[n/2];
		for(int i=0;i<n/2;i++){
			arr[2*i]=max[i];
			arr[2*i+1]=min[i];
		}


		for(long val:arr){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
6 1 5 2 4 3
*/