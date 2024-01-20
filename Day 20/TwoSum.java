/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        while (i < nums.length - 1) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            }
            i++;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int target = 6;

        int[] result = twoSum(arr, target);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
/*
OUTPUT
[0,2]
*/