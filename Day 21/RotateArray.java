/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
class RotateArray{
	static void reverse(int arr[],int start,int end){
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void rotate(int arr[],int k){

		k = k % arr.length;
		//right rotate
		reverse(arr,0,arr.length-1-k);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-1);

		//left rotate
		// reverse(arr,0,k-1);
		// reverse(arr,k,arr.length-1);
		// reverse(arr,0,arr.length-1);

	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int k=3;

		rotate(arr,k);

		for(int val:arr){
			System.out.print(val+" ");
		}

	}
}
/*
OUTPUT
5 6 7 1 2 3 4
*/