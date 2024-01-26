/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/
import java.util.*;
class SpiralMatrix{
	static List<Integer> findSpiralMatrix(int mat[][]){
		List<Integer> list = new ArrayList<>();

		int top=0;
		int left=0;
		int right=mat[0].length-1;
		int bottom=mat.length-1;

		while(top<=bottom && left<=right){

			for(int i=left;i<=right;i++){
				list.add(mat[top][i]);// 1 2 3
			}
			top++;
			for(int i=top;i<=bottom;i++){
				list.add(mat[i][right]); //6 9 
			}
			right--;
			if(top<=bottom){
				for(int i=right;i>=left;i--){
					list.add(mat[bottom][i]); //8 7 
				}
				bottom--;
			}
			if(left<=right){
				for(int i=bottom;i>=top;i--){
					list.add(mat[i][left]); // 4 5
				}
				left++;
			}
			
		}

		return list;

	}
	public static void main(String[] args) {
		int mat[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		List<Integer> result=findSpiralMatrix(mat);
		for(int val:result){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
1 2 3 6 9 8 7 4 5


*/