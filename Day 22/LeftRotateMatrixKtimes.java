/*Given three integers N, M, and K and a matrix Mat of dimensions NxM. Left rotate the matrix K times.

Input:
N=3,M=3,K=1
Mat=[[1,2,3],[4,5,6],[7,8,9]]
Output:
2 3 1
5 6 4
8 9 7
Explanation:
Left rotating the matrix once gives this result.
*/
class LeftRotateMatrixKtimes {
	static void reverse(int[][] Mat,int l,int r,int i){
        while(l<r){
            int temp=Mat[i][l];
            Mat[i][l]=Mat[i][r];
            Mat[i][r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int N = 3;
        int M = 3;
        int K = 1;
        int[][] Mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        

        for(int i=0;i<N;i++){
        	reverse(Mat,0,K-1,i);
        	reverse(Mat,K,M-1,i);
        	reverse(Mat,0,M-1,i);
        }
       
        

        System.out.println("Rotated Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT
2 3 1
5 6 4
8 9 7
*/
