/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/
class SortColors{
	public static void main(String[] args) {
		int arr[]={2,0,2,1,1,0};
		int n=6;

		for(int i=0;i<arr.length;i++){
			int j=i;
			while(j>0 && arr[j-1]>arr[j]){
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}

		for(int val:arr){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
0 0 1 1 2 2
*/
