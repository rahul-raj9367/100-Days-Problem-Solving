/*
Given a matrix of  size n x m. Your task is to make Zeroes, that means in whole matrix when you find a zero, convert its upper, lower, left, and right value to zero and make that element the sum of the upper, lower, left and right value. Do the following tasks according to the initial matrix.

Input: matrix = {{1, 2, 3, 4},
                 {5, 6, 0, 7}, 
                 {8, 9, 4, 6},
                 {8, 4, 5, 2}}
Output: {{1, 2, 0, 4}, 
         {5, 0, 20, 0},
         {8, 9, 0, 6}, 
         {8, 4, 5, 2}}
Explanation: As matrix[1][2] = 0, we will
perform the operation here. Then matrix[1][2]
= matrix[0][2] + matrix[2][2] + matrix[1][1] 
+ matrix[1][3] and matrix[0][2] = matrix[2][2] 
= matrix[1][1] = matrix[1][3] = 0
*/
class MakeZeroes{
	static void findMakeZeroes(int matrix[][],int i,int j,int temp[][],int n,int m){
		int top=0,bottom=0,left=0,right=0;
        if(i>0){
            top=temp[i-1][j];
            matrix[i-1][j]=0;
        }
        if(j<m-1){
            right=temp[i][j+1];
            matrix[i][j+1]=0;
        }
        if(i<n-1){
            bottom=temp[i+1][j];
            matrix[i+1][j]=0;
        }
        if(j>0){
            left=temp[i][j-1];
            matrix[i][j-1]=0;
        }
        matrix[i][j]=top+bottom+left+right;
	}
	public static void main(String[] args) {
		int matrix[][]={
			{1,2,3,4},
			{5,6,0,7},
			{8,9,4,6},
			{8,4,5,2}
		};

		int n=matrix.length;
        int m=matrix[0].length;
        int [][] temp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=matrix[i][j];
            }
        }

        for(int a=0;a<n;a++){
            for(int b=0;b<m;b++){
                if(temp[a][b]==0)
                    findMakeZeroes(matrix,a,b,temp,n,m);
            }
        }


		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1 2 0 4
5 0 20 0
8 9 0 6
8 4 5 2
*/