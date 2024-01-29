/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]
*/
import java.util.*;
class Permutations{
	// static void findPermutations(int arr[],List<List<Integer>> ans,boolean freq[],List<Integer> ds){
	// 	//base case
	// 	if(ds.size()==arr.length){
	// 		ans.add(new ArrayList<>(ds));
	// 		return;
	// 	}

	// 	for(int i=0;i<arr.length;i++){
	// 		if(!freq[i]){
	// 			freq[i]=true;
	// 			ds.add(arr[i]);
	// 			findPermutations(arr,ans,freq,ds);
	// 			ds.remove(ds.size()-1);
	// 			freq[i]=false;
	// 		}
	// 	}

	// }
	// public static void main(String[] args) {
	// 	int arr[]={1,2,3};
	// 	List<List<Integer>> ans= new ArrayList<>();
	// 	boolean freq[] = new boolean[arr.length];
	// 	findPermutations(arr,ans,freq,new ArrayList<>());
	// 	System.out.println(ans);
	// }

	private static void findPermutations(int index,int arr[],List<List<Integer>> ans){
		if(index==arr.length){

			List<Integer> ds= new ArrayList<>();
			for(int i=0;i<arr.length;i++){
				ds.add(arr[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}

		for(int i=index;i<arr.length;i++){
			swap(i,index,arr);

			findPermutations(index+1,arr,ans);
			// System.out.println("index :"+index);
			// for(int val:arr){
			// 	System.out.print(val+" ");
			// }
			// System.out.println();
			swap(i,index,arr);

			

		}

	}
	static void swap(int i,int j,int arr[]){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

	public static void main(String[] args) {
		int arr[]={1,2,3};
		List<List<Integer>> ans= new ArrayList<>();
		findPermutations(0,arr,ans);
		System.out.println(ans);
	}
}
/*
OUTPUT
[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
*/