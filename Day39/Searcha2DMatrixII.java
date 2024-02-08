/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom

Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
*/
class Searcha2DMatrixII{
	static boolean findSearcha2DMatrixII(int matrix[][],int target){
		// for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
		int row=0,col=matrix[0].length-1;
		while(row<matrix.length && col>=0){
			if(matrix[row][col]==target){
				return true;
			}else if(matrix[row][col]>target){
				col--;
			}else{
				row++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int matrix[][]={
			{1,4,7,11,15},
			{2,5,8,12,19},
			{3,6,9,16,22},
			{10,13,14,17,24},
			{18,21,23,26,30}
		};
		int target=5;

		System.out.println(findSearcha2DMatrixII(matrix,target));
	}
}
/*
OUTPUT
true
*/