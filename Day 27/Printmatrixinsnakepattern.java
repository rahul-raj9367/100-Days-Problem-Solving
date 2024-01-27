/*
Given an n x n matrix. In the given matrix, you have to print the elements of the matrix in the snake pattern.

Input: matrix[][] = {{45, 48, 54},
             {21, 89, 87}
             {70, 78, 15}}

Output: 45 48 54 87 89 21 70 78 15
*/
import java.util.*;
class Printmatrixinsnakepattern{
	public static void main(String[] args) {
		int mat[][]={
			{45, 48, 54},
			{21, 89, 87},
			{70, 78, 15}
		};

		List<Integer> list = new ArrayList<>();

		int top=0;
		int left=0;
		int right=mat.length-1;
		int bottom=mat[0].length-1;
		for(int i=0;i<mat.length;i++){
			if(i%2==0){
				for(int j=left;j<=right;j++){
					list.add(mat[i][j]);
				}
			}else{
				for(int k=right;k>=left;k--){
					list.add(mat[i][k]);
				}
			}
		}

		for(int val:list){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
45 48 54 87 89 21 70 78 15
*/