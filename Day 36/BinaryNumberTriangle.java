/*
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

You are required to print the pattern as shown in the examples below.

Example:
Input: ‘N’ = 5

Output: 
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
class BinaryNumberTriangle{
	public static void main(String[] args) {
		int n=5;

		for(int i=0;i<n;i++){
			int start;
			if(i%2==0){
				start=1;
			}else{
				start=0;
			}
			for(int j=0;j<=i;j++){
				System.out.print(start);
				start=start==0?1:0;
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1
01
101
0101
10101
*/