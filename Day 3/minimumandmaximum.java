/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.


Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
*/
class minimumandmaximum{
	public static void main(String[] args) {
		int temp;
		int arr[]={1, 345, 234, 21, 56789};

		//Method-1
		// for(int i=0;i<arr.length;i++){
		// 	for(int j=i+1;j<arr.length;j++){
		// 		if(arr[i]>arr[j]){
		// 			temp=arr[i];
		// 			arr[i]=arr[j];
		// 			arr[j]=temp;
		// 		}
		// 	}
		// }

		// int min=arr[0];
		// int max=arr[arr.length-1];

		// System.out.println("minimum is "+min+" and maximum is "+max+" in this Array");

		//Method-2
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		System.out.println("minimum is "+min+" and maximum is "+max+" in this Array");

		
		
		
	}
}
/*
OUTPUT
minimum is 1 and maximum is 10000 in this Array

minimum is 1 and maximum is 56789 in this Array
*/
