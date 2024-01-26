/*
Input N=5;
Print 
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/
class PaskalTriangle{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++){
			//space
			for(int j=i;j<n-1;j++){
				System.out.print(" ");
			}

			int number=1;
			for(int k=0;k<=i;k++){
				System.out.print(number+" ");
				number=number*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
} 
/*
OUTPUT
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/