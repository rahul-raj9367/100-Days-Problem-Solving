/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
Find the missing element.

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
*/
class Missingnumber{
	public static void main(String[] args) {
		int arr[]={6,1,2,8,3,4,7,10,5};
		int n=arr.length+1;

		int t=n*(n+1)/2;//formula to find natural number like n=5,15

		for(int i=0;i<arr.length;i++){
			t=t-arr[i];
		}

		System.out.println("output :" +t);
	}
}
/*
OUTPUT
output :4

output :9
*/