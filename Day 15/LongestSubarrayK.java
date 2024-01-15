/*
Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

Input :
A[] = {10, 5, 2, 7, 1, 9}
K = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
Without using collections
*/
class LongestSubarrayK{
	static int findLongestSubarrayK(int arr[],int k){
		int j=0;
		int maxLength=0;

		while(j<arr.length){
			int count=0,wSum=0;
			for(int i=j;i<arr.length;i++){
				wSum+=arr[i];
				if(k==wSum){
					if(i==0){
						count=i+1;
					}else{
						count=i;
					}
				}
			}
			maxLength=Math.max(maxLength,count);
			j++;
		}

		// int start = 0;
        // int currentSum = 0;
        // int maxLength = 0;

        // for (int end = 0; end < arr.length; end++) {
        //     currentSum += arr[end];

        //     while (currentSum > k && start <= end) {
        //         currentSum -= arr[start];
        //         start++;
        //     }

        //     if (currentSum == k) {
        //         maxLength = Math.max(maxLength, end - start + 1);
        //     }
        // }
		return maxLength;
	}

	public static void main(String[] args) {
		int arr[] = {-1, 2, 3};
		int k=6;

		int result = findLongestSubarrayK(arr,k);
		System.out.println("Length of the longest sub-array with sum " + k + ": " + result);
	}
}
/*
OUTPUT
Length of the longest sub-array with sum 15: 4
*/