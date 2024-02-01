/*
Problem statement
You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times

Find the minimum value of 'r'.

Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index, for all 'i' from 0 to ‘n-1'.

Example:
Input: 'n' = 5 , ‘arr’ = [3, 4, 5, 1, 2]

Output: 3 

Explanation:
If we rotate the array [1 ,2, 3, 4, 5] right '3' times then we will get the 'arr'. Thus 'r' = 3.
*/
class Rotation{
	static int findRotation(int arr[]){
		int low=0,high=arr.length-1;
		int ans=Integer.MAX_VALUE;
		while(low<=high){
			int mid=(low+high)/2;

			if(arr[low]<=arr[mid]){
				ans=Math.min(ans,arr[low]);
				low=mid+1;
			}else{
				high=mid-1;
				ans=Math.min(ans,arr[mid]);
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ans){
				return i;
			}
		}
		return -1;
		// int low = 0, high = arr.length - 1;
        // int ans = Integer.MAX_VALUE;
        // int index = -1;
        // while (low <= high) {
        //     int mid = (low + high) / 2;
        //     if (arr[low] <= arr[high]) {
        //         if (arr[low] < ans) {
        //             index = low;
        //             ans = arr[low];
        //         }
        //         break;
        //     }
        //     if (arr[low] <= arr[mid]) {
        //         // keep the minimum:
        //         if (arr[low] < ans) {
        //             index = low;
        //             ans = arr[low];
        //         }
        //         low = mid + 1;
        //     } else { 
        //         if (arr[mid] < ans) {
        //             index = mid;
        //             ans = arr[mid];
        //         }
        //         high = mid - 1;
        //     }
        // }
        // return index;
	}
	public static void main(String[] args) {
		int arr[]={3,4,5,1,2};
		System.out.println(findRotation(arr));
	}
}
/*
OUTPUT
3
*/