/*
Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

Input :
A[] = {10, 5, 2, 7, 1, 9}
K = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.

*/
import java.util.*;
class LongestSubArray{
	static int findLongestSubArray(int arr[],int k){
		HashMap<Integer,Integer> map = new HashMap<>();

		int maxLength=0;
		int currentsum=0;

		for(int i=0;i<arr.length;i++){
			currentsum+=arr[i];
			if(currentsum==k){
				maxLength= i+1;
			}
			else if(map.containsKey(currentsum - k)){
				maxLength = Math.max(maxLength, i - map.get(currentsum - k));

			}
			//System.out.println(i+" =  "+map.containsKey(currentsum - k));

			// System.out.println( i+" i = "+" "+maxLength+" currentsum = "+ currentsum);



			if(!map.containsKey(currentsum)){
				map.put(currentsum,i);
			}
		}

		// for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey() + " " + e.getValue());
        // }
		

		return maxLength;

		



		// int left=0,right=0;
		// int maxlen=0;
		// int n=arr.length;
		// int sum=arr[0];

		// while(right<n){
		// 	while(left<=right && sum>k){
		// 		sum-=arr[left];
		// 		left++;
		// 	}
		// 	if(sum==k){
		// 		maxlen=Math.max(maxlen,right-left+1);
		// 	}
		// 	right++;
		// 	if(right<n){
		// 		sum+=arr[right];
		// 	}
		// }

		// return maxlen;



	}
	public static void main(String[] args) {
		int arr[]={10, 5, 2, 7, 1, 9};
		int k=15;

		int result = findLongestSubArray(arr,k);
		System.out.println("Length of the longest sub-array with sum " + k + ": " + result);

		


	}
} 
/*
OUTPUT
Length of the longest sub-array with sum 15: 4
*/