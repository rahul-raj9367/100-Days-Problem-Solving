/*
You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.

A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.

Return the length longest chain which can be formed.

You do not need to use up all the given intervals. You can select pairs in any order. 

Example 1:
Input: pairs = [[1,2],[2,3],[3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4].

Example 2:
Input: pairs = [[1,2],[7,8],[4,5]]
Output: 3
Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].
 
*/
import java.util.*;
class MaximumLengthofPairChain{
	static int findMaximumLengthofPairChain(int arr[][]){
		Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
		
		int count=1;
		int current=arr[0][1];
		for(int i=1;i<arr.length;i++){
			int nextstart=arr[i][0];
			int nextend=arr[i][1];

			if(nextstart>current){
				count++;
				current=nextend;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[][]={
			{1,2},
			{2,3},
			{3,4}
		};

		System.out.println(findMaximumLengthofPairChain(arr));
	}
}
/*
OUTPUT
2
*/