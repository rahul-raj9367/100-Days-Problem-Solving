/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
*/
import java.util.*;
class CombinationSum{
	static void findCombinationSum(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> ds){
		if(index==arr.length){
			if(target==0){
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[index]<=target){
			ds.add(arr[index]);
			findCombinationSum(index,arr,target-arr[index],ans,ds);
			ds.remove(ds.size()-1);
		}
		findCombinationSum(index+1,arr,target,ans,ds);

	}
	public static void main(String[] args) {
		int arr[]={2,3,6,7};
		int target=7;
		List<List<Integer>> ans= new ArrayList<>();
		findCombinationSum(0,arr,target,ans,new ArrayList<>());

		for (List<Integer> innerList : ans) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
	}
}
/*
OUTPUT
2 2 3
7
*/