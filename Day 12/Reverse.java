/*
ZOHO-QUESTION
arr[]={1,2,3,4,5,6,7,8};
n=3;

output
{3,2,1,6,5,4,8,7}
*/
class Reverse{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};
		int n=3;
		// int arr2[]=new int[arr.length];
		// int j=0;
		// for(int i=n-1;i>=0;i--){
		// 	arr2[j]=arr[i];
		// 	j++;
		// }
		// for(int i=n+2;i>=n;i--){
		// 	arr2[j]=arr[i];
		// 	j++;
		// }
		// for(int i=n+4;i>=n+3;i--){
		// 	arr2[j]=arr[i];
		// 	j++;
		// }
		// for(int val:arr2){
		// 	System.out.print(" "+val);
		// }
		for(int i=0;i<arr.length;i+=n){
			int left=i;
			int temp;
			int right=Math.min(i+n-1,n-1);
			while(left<right){
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}

		}
		for(int val:arr){
			System.out.print(" "+val);
		}
	}
}
/*
OUTPUT
3 2 1 6 5 4 8 7
*/