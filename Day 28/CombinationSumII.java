/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
Each number in candidates may only be used once in the combination.
Note: The solution set must not contain duplicate combinations.

Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
*/
import java.util.*;
class CombinationSumII{
	private static void findCombinationSumII(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> ds){
		if(target==0){
			ans.add(new ArrayList<>(ds));
			return;
		}

		for(int i=index;i<arr.length;i++){
			if(i>index && arr[i]==arr[i-1]){ 
				continue;
			}
			if(arr[i]>target){
			 	break;
			}
			
			ds.add(arr[i]);
			findCombinationSumII(i+1,arr,target-arr[i],ans,ds);
			ds.remove(ds.size()-1);
		}
	}
	public static void main(String[] args) {
		int arr[]={10,1,2,7,6,1,5};
		int target=8;
		Arrays.sort(arr);
		List<List<Integer>> ans =new ArrayList<>();
		findCombinationSumII(0,arr,target,ans,new ArrayList<>());

		for(List<Integer> innerList:ans){
			for(Integer num:innerList){
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1 1 6
1 2 5
1 7
2 6
*/