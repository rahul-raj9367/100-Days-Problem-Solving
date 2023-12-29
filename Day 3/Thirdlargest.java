/*
Given an array of distinct elements. Find the third largest element in it.

Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, 
its output will be 5 because it is the 3 largest element in the array A.

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3

Input:
N = 2
A[] = {10,2}
Output: -1

*/
class Thirdlargest{
	static int findThirdlargest(int arr[]){
		if(arr.length>=3){
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr[arr.length-3];
		}else{
			return -1;
		}
		

	}
	public static void main(String[] args) {
		int arr[] = {2,4,1,3,5};
		System.out.println("Original Array");
		for(int element:arr){
			System.out.print(element+" ");
		}
		
		System.out.println();
		int result=findThirdlargest(arr);
		System.out.println("Thirdlargest is "+ result);

	}
}
/*
OUTPUT
Original Array
2 4 1 3 5
Thirdlargest is 3


Original Array
10 2
Thirdlargest is -1
*/