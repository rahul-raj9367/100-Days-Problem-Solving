/*
The task is to complete the insert() function which is used to implement Insertion Sort.


Example 1:
Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9

Take an element and place it is correct order
*/
class InsertionSort{
	public static void main(String[] args) {
		int arr[]={ 4, 1, 3, 9, 7};
		int n=5;

		for(int i=0;i<arr.length;i++){
			int j=i;
			while(j>0 && arr[j-1]>arr[j]){
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
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