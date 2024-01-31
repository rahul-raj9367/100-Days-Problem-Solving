/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
*/
class FindFirstandLastPositionofElementinSortedArray{
	public static int[] searchRange(int[] arr, int k) {
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        int n=arr.length;
        int f=firstOccurance(arr,n,k);
        if(f==-1){
            return new int[]{-1,-1};
        }
        int l=SecondOccurance(arr,n,k);

        return new int[]{f,l};
    }

    private static int firstOccurance(int arr[],int n,int k){
        int low=0,high=n-1;
        int first=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return first;
    }

    private static int SecondOccurance(int arr[],int n,int k){
        int low=0,high=n-1;
        int last=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return last;
    }
	public static void main(String[] args) {
		int arr[]={5,7,7,8,8,10};
		int target=8;
		int ans[]=searchRange(arr,target);
		for(int val:ans){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
3 4
*/