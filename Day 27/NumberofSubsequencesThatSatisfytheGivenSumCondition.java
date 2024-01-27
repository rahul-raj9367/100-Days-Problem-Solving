/*
You are given an array of integers nums and an integer target.

Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.

Input: nums = [3,5,6,7], target = 9
Output: 4
Explanation: There are 4 subsequences that satisfy the condition.
[3] -> Min value + max value <= target (3 + 3 <= 9)
[3,5] -> (3 + 5 <= 9)
[3,5,6] -> (3 + 6 <= 9)
[3,6] -> (3 + 6 <= 9)
*/
import java.util.*;
class NumberofSubsequencesThatSatisfytheGivenSumCondition{
	static int findNumberofSubsequencesThatSatisfytheGivenSumCondition(int index, int arr[], int target, List<Integer> list) {
        int count=0;
        if (index >= arr.length) {
            if (!list.isEmpty()) {
                int minValue = Collections.min(list);
                int maxValue = Collections.max(list);
                if (minValue + maxValue <= target) {
                    count++;
                }
            }
        } else {
            list.add(arr[index]);
            count +=findNumberofSubsequencesThatSatisfytheGivenSumCondition(index + 1, arr, target, list);
            list.remove(list.size() - 1);
            count +=findNumberofSubsequencesThatSatisfytheGivenSumCondition(index + 1, arr, target, list);
        }
        return count;
    }
	public static void main(String[] args) {
		int arr[]={3,5,6,7};
		int target=9;

		List<Integer> list=new ArrayList<>();
		int result=findNumberofSubsequencesThatSatisfytheGivenSumCondition(0,arr,target,list);
		System.out.println(result);
	}
}