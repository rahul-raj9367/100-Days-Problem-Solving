/*
Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7
*/
class Rotateby90degree{
	public static void main(String[] args) {
		int n=3;
		int matrix[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		//transpose the Array
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		//reverse the array
		for(int i=0;i<n/2;i++){
			for(int j=0;j<n;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[n-i-1][j];
				matrix[n-i-1][j]=temp;
			}
		}


        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
	}
}
/*
OUTPUT
Rotated Matrix:
3 6 9
2 5 8
1 4 7
*/
