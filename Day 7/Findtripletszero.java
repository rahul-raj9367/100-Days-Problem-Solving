/*
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
*/
import java.util.Arrays;
class Findtripletszero{
	static boolean checkFindtripletszero(int arr[],int n){
		Arrays.sort(arr);
		//[-3,-1,0,1,2]
		for(int i=0;i<n-2;i++){
			int second=i+1;
			int last=n-1;

			while(second<last){
				if(arr[i]+arr[second]+arr[last]==0){
					return true;
				}else if(arr[i]+arr[second]+arr[last]<0){
					second++;
				}else{
					last--;
				}
			}
		}
		return false;



	}
	public static void main(String[] args) {
		int arr[]={0, -1, 2, -3, 1};

		int n=5;

		boolean check=checkFindtripletszero(arr,n);

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