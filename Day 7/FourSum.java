/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

Input:
n = 6, X = 0
arr[] = [1,0 ,-1 ,0,-2,-2]
Output:
1
*/
import java.util.Arrays;
class FourSum{
	static boolean checkFourSum(int arr[],int n, int x){
		Arrays.sort(arr);
		//[-2,-2,-1,0,1,2]
		for(int i=0;i<n-3;i++){
			for(int j=i+1;j<n-2;j++){
				int third=j+1;
				int last=n-1;

				while(third<last){
					if(arr[i]+arr[j]+arr[third]+arr[last]==x){
						return true;
					}
					else if(arr[i]+arr[j]+arr[third]+arr[last]<x){
						third++;
					}
					else{
						last--;
					}
				}
			}
		}
		return false;

	}
	public static void main(String[] args) {
		int arr[]={1,0 ,-1 ,0,-2,-2};

		int n=6,x=0;

		boolean check=checkFourSum(arr,n,x);

		if(check){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}
/*
OUTPUT
1
*/