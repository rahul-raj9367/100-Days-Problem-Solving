/*
Given a matrix M of n*n size, the task is to complete the function which prints its elements in a diagonal pattern as depicted below.

Input:
N = 3
mat[][] = {{1 2 3},{4 5 6},{7 8 9}}
Output: 1 2 4 7 5 3 6 8 9
*/
class Printmatrixindiagonalpattern{
	static void findPrintmatrixindiagonalpattern(int arr[][],int n,int m,int ans[]){
		
		int r=0,c=0;
		for(int i=0;i<ans.length;i++){
			ans[i]=arr[r][c];
			if((r+c)%2==0){
				if(c==n-1){
					r++;
				}else if(r==0){
					c++;
				}else{
					c++;
					r--;
				}	
			}else{
				if(r==n-1){
					c++;
				}else if(c==0){
					r++;
				}else{
					r++;
					c--;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int n=arr.length;
		int m=arr[0].length;

		int ans[]=new int[n*m];

		findPrintmatrixindiagonalpattern(arr,n,m,ans);

		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}


	}
}
/*
OUTPUT
1 2 4 7 5 3 6 8 9
*/