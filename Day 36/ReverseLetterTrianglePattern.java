/*
Input Format: N = 6
Result:   
A B C D E F
A B C D E 
A B C D
A B C
A B
A
*/
class ReverseLetterTrianglePattern{
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++){

			for(char ch='A';ch<='A'+(n-i-1);ch++){
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
A B C D E F
A B C D E
A B C D
A B C
A B
A
*/