/*
Given an array of distinct integers.
The task is to count all the triplets such that sum of two elements equals the third element

Input: 
N = 4 
arr[] = {1, 5, 3, 2}
Output: 2 
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5
*/
import java.util.Arrays;
class Countthetriplets{
	static int findcountthetriplets(int arr[],int n){
		Arrays.sort(arr);
		int count=0;
		for(int i=arr.length-1;i>=2;i--){
			int low=0;
			int high=i-1;

			while(low<high){
				int sum=arr[low]+arr[high];

				if(arr[i]==sum){
					count++;
					low++;
					high--;
				}else if(sum< arr[i]){
					low++;
				}else{
					high--;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]={1,5,3,2};
		int n=4;

		int c=findcountthetriplets(arr,n);
		System.out.println(c);
	}
}
/*
OUTPUT
2
*/