/*
Input Format: N = 6
Result:   
A 
B B
C C C
D D D D
E E E E E
F F F F F F
*/
class AlphaRampPattern{
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++){
			int ch=((int)(char)'A'+i);
			for(int j=0;j<=i;j++){
				System.out.print((char)ch+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
A
B B
C C C
D D D D
E E E E E
F F F F F F
*/