/*
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 4

Output: 

1      1
12    21
123  321
12344321
*/
class NumberCrown{
	public static void main(String[] args) {
		int n=4;
		int spaces=2*(n-1);

		for(int i=1;i<=n;i++){
			//number
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}


			//space
			for(int j = 1;j<=spaces;j++){
          		System.out.print(" ");
          	}
          	spaces-=2;


			//number
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
			
		}
		
	}
}
/*
OUTPUT
1      1
12    21
123  321
12344321
*/