/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
*/
class SetMatrixZeroes{
	public static void main(String[] args) {
		int arr[][]={
			{1,1,1},
			{1,0,1},
			{1,1,1}
		};
		int N=arr.length;
		int M=arr[0].length;

		int col[]=new int[N];
		int row[]=new int[M];

		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(arr[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
			}
		}

		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(row[i]==1||col[j]==1){
					arr[i][j]=0;
				}
			}
		}

		System.out.println("Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
}
/*
OUTPUT
Matrix:
1 0 1
0 0 0
1 0 1
*/