/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.


Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]
*/
import java.util.*;
class MajorityElementII{
	 public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list= new ArrayList<>();

        if(nums.length<=1){
            for(int i=0;i<nums.length;i++){
                 list.add(nums[i]);
            }
            return list;
        }
        for(int num:nums){
		 	map.put(num,map.getOrDefault(num,0)+1);
			
		    if(map.get(num) > nums.length/3 && !list.contains(num)){
		 		list.add(num);
		 	}
		 }
         return list;
    }
	public static void main(String[] args) {
		int arr[]={3,2,3};
		List<Integer> ans= majorityElement(arr);
		System.out.println(ans);
	}
}
/*
OUTPUT
[3]
*/