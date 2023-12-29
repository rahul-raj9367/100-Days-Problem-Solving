/*
Given an integer array and another integer element. 
The task is to find if the given element is present in array or not.

Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case 
with array as {1, 2, 3 4} and element 
to be searched as 3.  Since 3 is 
present at index 2,
output is 2.
*/
class SearchElement{
	static int findSearchElement(int arr[],int target){
		int ans=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				ans=i;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		int target=3;
		System.out.println("Original Array");
		for(int element:arr){
			System.out.print(element+" ");
		}
		
		System.out.println();

		int result=findSearchElement(arr,target);
		System.out.println("Since "+target+" is present at index "+ result+",output is :"+ result);
	}
}
/*
OUTPUT
Original Array
1 2 3 4
Since 3 is present at index 2,output is :2
*/