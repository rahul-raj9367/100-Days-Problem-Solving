/*
USING-SLIDING WINDOW APPROACH 
MinSubarray 
INPUT
arr[]=[2,9,31,-4,21,7]
k=3
OUTPUT
24
explaination [-4,21,7]=24
*/
class MinSubarray{
	static int findMinSubarray(int arr[],int k){
		int wSum=0,mSum=Integer.MAX_VALUE;
		for(int i=0;i<k;i++){
			wSum+=arr[i];
		}
		for(int i=k;i<arr.length;i++){
			wSum=wSum-arr[i-k]+arr[i];
			mSum=Math.min(wSum,mSum);
		}
		return mSum;
	}
	public static void main(String[] args) {
		int arr[]={2,9,31,-4,21,7};
		int k=3;

		System.out.println(findMinSubarray(arr,k));
	}
}
/*
OUTPUT
24
*/