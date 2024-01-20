/*
Given a 2D binary matrix A of dimensions NxM, determine the row that contains a minimum number of 1's.
Note-The matrix contains only 1s and 0s. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices

Input:
N=4,M=4
A=[[1,1,1,1],[1,1,0,0],[0,0,1,1],[1,1,1,1]]
Output:
2
Explanation:
Rows 2 and 3 contain the minimum number 
of 1's(2 each).Since, 2 is less than 3.
Thus, the answer is 2.
*/
class Rowwithminimumnumberof1s{
	public static void main(String[] args) {
		int matrix[][]={
			{1,1,1,1}, //4
			{1,1,0,0},//2
			{0,0,1,1},//2
			{1,1,1,1}//4
		};
		int ans=-1;
		int max=Integer.MAX_VALUE;
		int n=4,m=4;

		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<m;j++){
				if(matrix[i][j]==1){
					count++;
				}
			}

			if(count<max){
				max=count;
				ans=i+1;
			}
		}	
		System.out.println(ans);
	}
}
/*
OUTPUT
2
*/