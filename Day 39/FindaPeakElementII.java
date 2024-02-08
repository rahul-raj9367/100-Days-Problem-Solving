/*
A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.

Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].

You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.

Input: mat = [[1,4],[3,2]]
Output: [0,1]
Explanation: Both 3 and 4 are peak elements so [1,0] and [0,1] are both acceptable answers.
*/
class FindaPeakElementII{
	static int maxEl(int mat[][],int n ,int m,int mid){
		int index=-1;
		int max=-1;
		for(int i=0;i<n;i++){
			if(mat[i][mid]>max){
				max=mat[i][mid];
				index=i;
			}
		}
		return index;
	}
	static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = maxEl(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < m ? mat[row][mid + 1] : -1;

            if (mat[row][mid] > left && mat[row][mid] > right)
                return new int[]{row, mid};
            else if (mat[row][mid] < left)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return new int[]{-1, -1};
    } 
	public static void main(String[] args) {
		int mat[][]={
			{1,4},
			{3,2}
		};
		int arr[]=findPeakGrid(mat);
		for(int val:arr){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
1 0
*/