/*
USING-SLIDING WINDOW APPROACH
MaxSubarray 
INPUT
arr[]=[2,9,31,-4,21,7]
k=3
OUTPUT
48
explaination [31,-4,21]=48
*/
class MaxSubarray{
	static int findMaxSubarray(int arr[],int k){
		int wSum=0,mSum=Integer.MIN_VALUE;
		for(int i=0;i<k;i++){
			wSum+=arr[i];
		}

		for(int i=k;i<arr.length;i++){
			wSum=wSum-arr[i-k]+arr[i];
			mSum=Math.max(wSum,mSum);
		}
		return mSum;

	}
	public static void main(String[] args) {
		int arr[]={2,9,31,-4,21,7};
		int k=3;

		System.out.println(findMaxSubarray(arr,k));
	}
}
/*
OUTPUT
48
*/