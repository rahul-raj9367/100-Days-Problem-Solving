/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists). Given an array arr[] of size N, Return the index of any one of its peak elements. 
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. Also, arr[] will be in ascending order before the peak element, and in descending order after that.


Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.
*/
class Peakelement{
	static int findpeakelement(int arr[],int n){
		int max=0;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++){
			if(arr[i]==max){
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int n=3;

		System.out.println(findpeakelement(arr,n));
			
	}
}
/*
OUTPUT
2
*/