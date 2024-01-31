/*
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
*/
class Numberofoccurrence{
	static int count(int[] arr, int n, int k) {
        int f=firstOccurance(arr,n,k);
        int l=SecondOccurance(arr,n,k);
        
         if(f==-1){
            return 0;
        }

        return l-f+1;
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
		int n = 7, k = 2,arr[] = {1, 1, 2, 2, 2, 2, 3};
		System.out.println(count(arr,n,k));
	}
}
/*
OUTPUT
4
*/