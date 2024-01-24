/*
Print numbers from 1 to N without the help of loops .
Using Recursion

Example 1
Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
*/
class Print1ToNWithoutLoop{
	static void print1ToNWithoutLoopp(int i,int n){
		if(i<=n){
			System.out.print(i+" ");
			i++;
			print1ToNWithoutLoopp(i,n);
		}
	}
	public static void main(String[] args) {
		int n=10;
		int i=1;
		print1ToNWithoutLoopp(i,n);
		
	}
}
/*
OUTPUT
1 2 3 4 5 6 7 8 9 10
*/