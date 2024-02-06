/*
You are given an array consisting of n integers which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
The first line of input contains two space-separated integers n and k.
The second line contains n space-separated integers denoting the position of the stalls.

Input:
n=5 
k=3
stalls = [1 2 4 8 9]
Output:
3
Explanation:
The first cow can be placed at stalls[0], 
the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, 
which also is the largest among all possible ways.
*/
import java.util.*;
class AggressiveCows{
	static int findAggressiveCows(int arr[],int k){
		Arrays.sort(arr);
		int ans=Integer.MIN_VALUE;
		int low=1,high=arr[arr.length-1]-arr[0];
		while(low<=high){
			int mid=(low+high)/2;

			if(find_cows(arr,mid,k)==true){
				ans=mid;
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return ans;
	}
	static boolean find_cows(int arr[],int dist,int cows){
		int count=1,last=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]-last>=dist){
				count++;
				last=arr[i];
			}
			if(count>=cows) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]={1,2,4,8,9};
		int k=3;
		System.out.println(findAggressiveCows(arr,k));
	}
}
/*
OUTPUT
3
*/