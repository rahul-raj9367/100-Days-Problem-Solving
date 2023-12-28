/*
For a given number N check if it is prime or not. 
A prime number is a number which is only divisible by 1 and itself.

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.

Input:
N = 25
Output:
0
Explanation:
25 has 3 factors 1, 5, 25
*/
import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter the number:");
		int n =in.nextInt();
		int i,flag=0;
		if(n==0||n==1){
			System.out.println(n+"is not a prime number");
		}
		else{
			for(i=2;i<n;i++){
				if(n%i==0){
					System.out.println(n+"is not a prime number");
					flag=1;
					break;
				}			
			}
			if(flag==0){
				System.out.println(n+"is a prime number");
			}
		}
	}
}
/*
OUTPUT
5
is a Prime Number 1

Enter the number:25
25is not a prime number
*/