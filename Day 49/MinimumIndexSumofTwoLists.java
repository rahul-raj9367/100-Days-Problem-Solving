/*
Given two arrays of strings list1 and list2, find the common strings with the least index sum.

A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order.

 

Example 1:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only common string is "Shogun".
Example 2:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
Example 3:

Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
Output: ["sad","happy"]
Explanation: There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".

*/
import java.util.*;
class  MinimumIndexSumofTwoLists{
	static String[] findMinimumIndexSumofTwoLists(String list1[],String list2[]){
		List<String> list=new ArrayList<>();
		int minvalue=Integer.MAX_VALUE;
		for(int i=0;i<list1.length;i++){
			for(int j=0;j<list2.length;j++){
				if(list1[i].equals(list2[j])){
					int indexSum=i+j;
					if(indexSum<minvalue){
						minvalue=indexSum;
						list.clear();
						list.add(list1[i]);
					}else if(indexSum==minvalue){
						list.add(list1[i]);
					}
				}
			}
		}

		return list.toArray(new String[list.size()]);
		// Map<String, Integer> map = new HashMap<>();
        // List<String> result = new ArrayList<>();
        // int minIndexSum = Integer.MAX_VALUE;
        
        // // Store indices of words from list1 in the map
        // for (int i = 0; i < list1.length; i++) {
        //     map.put(list1[i], i);
        // }
        
        // // Iterate through list2 to find common words with least index sum
        // for (int i = 0; i < list2.length; i++) {
        //     if (map.containsKey(list2[i])) {
        //         int indexSum = i + map.get(list2[i]);
        //         if (indexSum < minIndexSum) {
        //             minIndexSum = indexSum;
        //             result.clear();
        //             result.add(list2[i]);
        //         } else if (indexSum == minIndexSum) {
        //             result.add(list2[i]);
        //         }
        //     }
        // }
        
        // return result.toArray(new String[result.size()]);
	}
	public static void main(String[] args) {
		String list1[]= {"happy","sad","good"}, list2[] = {"sad","happy","good"};
		String ans[]=findMinimumIndexSumofTwoLists(list1,list2);
		for (String w :ans ) {
			System.out.print(w+" ");
		}
	}
}
/*
OUTPUT
happy sad
*/