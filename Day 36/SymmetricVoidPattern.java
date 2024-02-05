/*
Input Format: N = 6
Result:   
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
*/
class SymmetricVoidPattern{
	public static void main(String[] args) {
		int n=6;
		int spaces=0;
		for(int i=0;i<n;i++){
			//star
			for(int j=i;j<n;j++){
				System.out.print("*");
			}

			//space
			for(int j=0;j<spaces;j++){
				System.out.print(" ");
			}
			spaces+=2;

			//star
			for(int j=i;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		int spacess=10;
		for(int i=0;i<n;i++){
			//star
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}

			//space
			for(int j=0;j<spacess;j++){
				System.out.print(" ");
			}
			spacess-=2;

			//star
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
*/