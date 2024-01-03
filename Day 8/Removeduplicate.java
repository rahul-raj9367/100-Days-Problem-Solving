/*
Given a sorted array A[] of size N, delete all the duplicated elements from A[]. 
Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Input:
N = 4
Array = {1, 2, 2, 4}
Output: 1 2 4
Explation: After removing all duplicates modify array will contains 
{1, 2, 4} at first 3 positions so you should return 3 after modify the array.
*/
class Removeduplicate{
	static int findRemoveduplicate(int arr[],int n){
		int index=0;

		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[index++]=arr[i];
			}
		}
		arr[index++]=arr[n-1];

		return index;
	}
	public static void main(String[] args) {
		int arr[]={1,2,2,4};
		int n=4;

		int result=findRemoveduplicate(arr,n);
		System.out.println(result);
	}
}
/*
OUTPUT
3
*/