/*
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
Example 1:

Input: 
N = 5
arr[] = {4, 1, 3, 9, 7}
Output: 
1 3 4 7 9

push the min value or max value in the first or last position Swap
*/
class BubbleSort{
	public static void main(String[] args) {
		int arr[]={4,1,3,9,7};
		int n=5;
		for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int val:arr){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
1 3 4 7 9
*/