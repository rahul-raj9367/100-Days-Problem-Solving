/*
Given an array Arr of N positive integers and another number X. 
Determine whether or not there exist two elements in Arr whose sum is exactly X.

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
*/
import java.util.HashSet;
class KeyPair{
	static boolean checkKeypair(int arr[],int x,int n){

		HashSet<Integer> set = new HashSet<>();

		for(int i=0;i<n;i++){
			int complement =x-arr[i];
			if(set.contains(complement)){
				return true;
			}
			set.add(arr[i]);
		}
		return false;

		//  for(int i=0;i<n;i++){
		// 	for(int j=i+1;j<n;j++){
		// 		if(arr[i]+arr[j]==x){
		// 			return true;
		// 		}
		// 	}
		// }
		// return false;
		
	}
	public static void main(String[] args) {
		int arr[]={1,4,45,6,10,8};
		int x=16;
		int n=6;

		boolean ch=checkKeypair(arr,x,n);
		if(ch){
			System.out.println("yes");
		}else{
			System.out.println("No");
		}
	}
}
/*
Output
yes
*/