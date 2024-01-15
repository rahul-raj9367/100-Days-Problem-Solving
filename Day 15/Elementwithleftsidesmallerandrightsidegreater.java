/*
Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.

Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.

N = 4
A[] = {4, 2, 5, 7}
Output:
5
Explanation:
Elements on left of 5 are smaller than 5
and on right of it are greater than 5.
*/
class Elementwithleftsidesmallerandrightsidegreater{
	static int findElement(int arr[],int n){
		int leftMax[]=new int[n];
		int rightMin[]=new int[n];

		leftMax[0]=arr[0];
		for(int i=1;i<n;i++){
			leftMax[i]=Math.max(leftMax[i-1],arr[i]);
		}

		rightMin[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
			rightMin[i]=Math.min(rightMin[i+1],arr[i]);
		}

		for(int i=1;i<n;i++){
			if(leftMax[i]==rightMin[i]){
				return arr[i];
			}
		}		
		return -1;


	}
	public static void main(String[] args) {
		int arr[]={4, 2, 5, 7};
		int n=4;
		System.out.println(findElement(arr,n));
	}
}
/*
OUTPUT
5
*/