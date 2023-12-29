/*

Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
*/
import java.util.Scanner;
class Squareroot{
	static int findSquareroot(int x){
		int start=1,end=x,ans=0;

		while(start<=end){
			int mid=(start+end)/2;

			if(mid*mid<=x){
				ans=mid;
				start=mid+1;
			}else{
				end=mid-1;
			}
		}

		return ans;

		// return (int)Math.sqrt(x);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number :");
		int x=sc.nextInt();

		int result=findSquareroot(x);
		System.out.println("Output: "+ result);
	}
} 
/*
OUTPUT
Enter the Number :5
Output: 2

Enter the Number :4
Output: 2
*/
