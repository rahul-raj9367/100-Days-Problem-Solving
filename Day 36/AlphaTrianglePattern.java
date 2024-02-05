/*
Input Format: N = 6
Result:   
F
E F
D E F
C D E F
B C D E F
A B C D E F
*/
class AlphaTrianglePattern{
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++){
			char chr=((char)(int)('F'-i));
			for(char ch=chr;ch<='F';ch++){
				System.out.print(ch+" ");
			}
			System.out.println();
		}		
	}
}
/*
OUTPUT
F
E F
D E F
C D E F
B C D E F
A B C D E F
*/