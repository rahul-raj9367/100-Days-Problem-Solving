/*
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.

Example 1:
Input:
N = 5
arr[] = {4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Explanation:
Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.

Select minimum and swap
*/
class SelectionSort{
	public static void main(String[] args) {
		int arr[]={4,1,3,9,7};
		int n=5;

		for(int i=0;i<n-2;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			swap(arr, i, min);
		}

		for(int val:arr){
			System.out.print(val+" ");
		}
	}
	static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
/*
OUTPUT
1 3 4 9 7
*/
