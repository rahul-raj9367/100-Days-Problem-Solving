/*
Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

 

Example 1:
Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.
Example 2:
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
*/
import java.util.*;
class LeastNumberofUniqueIntegersafterKRemovals{
	static int findLeastNumberofUniqueIntegersafterKRemovals(int arr[],int k){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr){
			map.put(i,map.getOrDefault(i,0)+1);
		}
		List<Integer> list=new ArrayList<>();
		for(int i:map.values()){
			list.add(i);
		}
		Collections.sort(list);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			int ele=it.next();
			if(k>=ele){
				k-=ele;
				it.remove();
			}
		}
		return list.size();
	}
	public static void main(String[] args) {
		int arr[]={4,3,1,1,3,3,2}, k = 3;
		System.out.println(findLeastNumberofUniqueIntegersafterKRemovals(arr,k));
	}
}
/*
OUTPUT
2
*/