/*
Given a binary matrix (containing only 0 and 1) of order NxN. All rows are sorted already, We need to find the row number with the maximum number of 1s. Also, find the number of 1s in that row.
Note:

1. In case of a tie, print the smaller row number.
2. Row number should start from 0th index.

Example 1
Input:
N=3
mat[3][3] = {0, 0, 1, 
              0, 1, 1, 
              0, 0, 0}
Output:
Row number = 1
MaxCount = 2
Explanation:
Here, max number of 1s is in row number 1
and its count is 2.
*/
import java.util.*;
class Binarymatrixhavingmaximumnumberof1s{
	static int[] findMaxRow(int mat[][], int N) {
        // code here
        // int index=-1;
        // int ans=Integer.MIN_VALUE;
        // for(int i=0;i<N;i++){
        //     int rowsum=0;
        //     for(int j=0;j<N;j++){
        //         rowsum+=mat[i][j];
        //     }
        //     // ans=Math.max(ans,rowsum);
            
        //     if(rowsum>ans){
        //         ans=rowsum;
        //         index=i;
        //     }
        // }
        // return new int[]{index,ans};
        int index=0;
        int ans=0;
        for(int i=0;i<N;i++){
           int rowsum=N-findmax(mat[i],N,1);
            if(rowsum>ans){
                ans=rowsum;
                index=i;
            }
        }
        return new int[]{index,ans};
    }
    static int findmax(int arr[],int m,int t){
        int ans=m;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]>=t){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int mat[][]={
			{0,0,1},
			{0,1,1},
			{0,0,0}
		};
        int n=3;
		int ans[]=findMaxRow(mat,n);
        String arrayAsString = Arrays.toString(ans);
        System.out.println(arrayAsString);
	}
}
/*
OUTPUT
[1, 2]
*/