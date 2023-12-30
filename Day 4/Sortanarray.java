/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
*/
class Sortanarray{
	Sortanarray(int arr[]){
		//using bubble sort
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

	}
	public static void main(String[] args) {
		int arr[]={0,2,1,2,0};
		System.out.println("Before sorting Array");

		for(int element:arr){
			System.out.print(element+" ");
		}
		System.out.println();


		new Sortanarray(arr);

		System.out.println("After sorting Array");

		for(int element:arr){
			System.out.print(element+" ");
		}
	}
}
/*
OUTPUT
Before sorting Array
0 2 1 2 0
After sorting Array
0 0 1 2 2
*/