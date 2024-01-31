/*
Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
Exlpanation: Since, 6 is present in 
the array at index 4 (0-based indexing),
output is 1.
*/
class Searchinganelementinasortedarra{
	static int searchInSorted(int nums[], int N, int target){
        
        // Your code here
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(target==nums[mid]){
                return 1;
            }else if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;
        
    }
	public static void main(String[] args) {
		int N = 5, K = 6,arr[] = {1,2,3,4,6};
		System.out.println(searchInSorted(arr,N,K));
	}
}
/*
OUTPUT
1
*/