/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/
class MoveZeros{
	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 3};
        int n = 5;

        int i = 0, j = 1;
        while (j < n) {
            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[i] == 0 && arr[j] == 0) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
	}
}
/*
OUTPUT
1,3,12,0,0
*/