/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
import java.util.HashMap;
class MajorityElement{
	static int findMajorityElement(int arr[]){
		HashMap<Integer,Integer> map= new HashMap<>();

		for(int num:arr){
			map.put(num,map.getOrDefault(num,0)+1);
			
			if(map.get(num) > arr.length/2){
				return num;
			}

		}

		return -1;



	}
	public static void main(String[] args) {
		int arr[]={2,2,1,1,1,2,2};

		int result=findMajorityElement(arr);
		if(result!=-1){
			  System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
		}
	}
}
/*
OUTPUT
Majority Element: 2
*/