/*
Find the Duplicate Number
Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
*/
class RepeatingNumber{
	public static void main(String[] args) {
		int arr[]={3,1,3,4,2};

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate Number in this array "+arr[j]);
				}
			}
		}
	}
}
/*
OUTPUT
Duplicate Number in this array 2

Duplicate Number in this array 3
*/