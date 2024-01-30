/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/
import java.util.*;
class PermutationsII{
	static void findPermutationsII(int index,int arr[],List<List<Integer>> ans){
		if(index==arr.length){
			List<Integer> ds = new ArrayList<>();

			for(int i=0;i<arr.length;i++){
				ds.add(arr[i]);
			}
			ans.add(ds);
		}

		for(int i=index;i<arr.length;i++){
			if(i>index && arr[i]==arr[i-1]){
				continue;
			}
			swap(i,index,arr);
			findPermutationsII(index+1,arr,ans);
			swap(i,index,arr);
		}

	}

	static void swap(int i,int j,int arr[]){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;

	}
	public static void main(String[] args) {
		int arr[]={1,1,2};
		List<List<Integer>> ans= new ArrayList<>();
		findPermutationsII(0,arr,ans);

		System.out.println(ans);
	}
}
/*
OUTPUT
[[1, 1, 2], [1, 2, 1], [2, 1, 1]]
*/