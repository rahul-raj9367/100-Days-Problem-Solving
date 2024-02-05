/*
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 5

Output: 

*
**
***
****
*****
****
***
**
*

*/
class RotatedTriangle{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=2*n-1;i++){
			int start=i;
			if(i>n){
				start=(2*n-i);
			}
			for(int j=1;j<=start;j++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
/*
OUTPUT
*
**
***
****
*****
****
***
**
*
*/