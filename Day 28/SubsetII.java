/*
Given an integer array nums that may contain duplicates, return all possible 
subsets(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
 
Example 1:
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
*/
import java.util.*;
class SubsetII{
	static void findSubsetII(int index,int arr[],List<List<Integer>> ans,List<Integer> ds){
		ans.add(new ArrayList<>(ds));
		for(int i=index;i<arr.length;i++){
			if(i!=index && arr[i]==arr[i-1]){
				continue;
			}
			ds.add(arr[i]);
			findSubsetII(i+1,arr,ans,ds);
			ds.remove(ds.size()-1);
			
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,2};

		List<List<Integer>> ans = new ArrayList<>();
		findSubsetII(0,arr,ans,new ArrayList<>());
		// for(List<Integer> innerList:ans){
		// 	for(Integer val:innerList){
		// 		System.out.print(val);
		// 	}
		// 	System.out.println();
		// }
		System.out.println(ans);
	}
}
/*
OUTPUT
[[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
*/