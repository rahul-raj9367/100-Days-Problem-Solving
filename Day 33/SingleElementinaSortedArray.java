/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums =
*/
class SingleElementinaSortedArray{
	static int findSingleElementinaSortedArray(int arr[],int n){
		if(n==1){
			return arr[0];
		}
		if(arr[0]!=arr[1]){
			return arr[0];
		}
		if(arr[n-1]!=arr[n-2]){
			return arr[n-1];
		}

		int low=1,high=n-2;

		while(low<=high){
			int mid=(low+high)/2;

			if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
				return arr[mid];
			}
			if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1]){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return -1;

		//brute force solution
		// if(n==1){
		// 	return arr[0];
		// }

		// for(int i=0;i<arr.length;i++){
		// 	if(i==0){
		// 		if(arr[i]!=arr[i+1]){
		// 			return arr[0];
		// 		}
		// 	}else if(i==n-1){
		// 		if(arr[i]!=arr[i-1]){
		// 			return arr[i];
		// 		}
		// 	}else{
		// 		if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
		// 			return arr[i];
		// 		}
		// 	}
		// }
		// return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,1,2,3,3,4,4,8,8};
		int n=arr.length;

		System.out.println(findSingleElementinaSortedArray(arr,n));
	}
}
/*
OUTPUT
2
*/