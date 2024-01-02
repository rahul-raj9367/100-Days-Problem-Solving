/*
Given an array arr of size n and an integer X.
Find if there's a triplet in the array which sums up to the given integer X.

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
*/
import java.util.Arrays;
class TripletSum{
	static boolean checkTripleSum(int arr[],int n,int x){

		// for(int i=0;i<n-2;i++){
		// 	for(int j=i+1;j<n;j++){
		// 		for(int k=j+1;k<n;k++){
		// 			if(arr[i]+arr[j]+arr[k]==x){
		// 				return true;
		// 			}
		// 		}
		// 	}
		// }
		// return false;

		Arrays.sort(arr);
		//[1,4,6,8,10,45]

		for(int i=0;i<n-1;i++){

			int second=i+1;
			int third=n-1;

			while(second<third){
				if(arr[i] + arr[second] + arr[third] == x){
					return true;
				}
				else if(arr[i] + arr[second] +arr[third] < x){
					second++;
				}
				else{
					third--;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		int arr[]={1, 4 ,45, 6, 10, 8};
		int n=6,x=13;

		boolean check=checkTripleSum(arr,n,x);

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