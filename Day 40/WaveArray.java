/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.

Note:The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.

Example 1:
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.

*/
class WaveArray{
	static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int n=5,arr[]={1,2,3,4,5};
		for(int i=0;i<arr.length-1;i+=2){
			swap(arr,i,i+1);
		}

		for(int val:arr){
			System.out.print(val+" ");
		}

	}
}
/*
OUTPUT
2 1 4 3 5
*/