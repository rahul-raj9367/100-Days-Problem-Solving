/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2


Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
*/
class DuplicateNumber{
	public static void main(String[] args) {
		int arr[] = {3, 1, 3, 4, 2};
        int n = 5;
        
       // HashSet<Integer> seen = new HashSet<>();
        // int ans = -1; 
        // for (int i = 0; i < nums.length; i++) {
        //     if (seen.contains(nums[i])) {
        //         ans = nums[i];
        //         break;
        //     } else {
        //         seen.add(nums[i]);
        //     }
        // }
        // return ans;


        //"Cycle Detection" or "Tortoise and Hare" algorithm
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;

            if(nums[index]<0){
                ans=Math.abs(nums[i]);
                break;
            }else{
                nums[index]=-nums[index];
            }
        }
        return ans;
        System.out.println("Duplicate number: " + ans);	
    }
}
/*
OUTPUT
3
*/
