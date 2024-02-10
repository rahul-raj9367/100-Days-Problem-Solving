/*
Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position is low (the index of the array) and its ending position is high(the index of the array).

Note: The low and high are inclusive.

Implement the partition() and quickSort() functions to sort the array.

Example 1:

Input: 
N = 5 
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
*/
class QuickSort{
	static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int par=partition(arr,low,high);
            quickSort(arr,low,par-1);
            quickSort(arr,par+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    } 
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
	public static void main(String[] args) {
		int arr[]={ 4, 1, 3, 9, 7};
		quickSort(arr,0,arr.length-1);

		for(int val:arr){
			System.out.print(val+" ");
		}	
	}
}
/*
OUTPUT
1 3 4 7 9
*/