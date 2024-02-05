/*
Input Format: N = 6
Result:   
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
*/
class SymmetricButterflyPattern{
	public static void main(String[] args) {
		int n=6;
		int spaces=2*n-2;
		for(int i=1;i<=2*n-1;i++){
			//star
			int stars=i;
			if(i>n){
				stars=2*n-i;
			}

			for(int j=1;j<=stars;j++){
				System.out.print("*");
			}

			//space
			
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}

			if(i<n){
				spaces-=2;
			}else{
				spaces+=2;
			}

			//stars
			for(int j=1;j<=stars;j++){
				System.out.print("*");
			}
			System.out.println();

		}
		// int n=4;
		// for(int i=0;i<2*n-1;i++){
		// 	for(int j=0;j<2*n-1;j++){
		// 		int top=i;
		// 		int left=j;
		// 		int bottom=(2*n-1)-1-i;
		// 		int right=(2*n-1)-1-j;

		// 		System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
		// 	}
		// 	System.out.println();
		// }
	}
}
/*
OUTPUT
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

*/