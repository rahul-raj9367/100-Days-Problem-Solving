/*
Problem statement
Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.

Sample Input 1 :
10
Sample Output 1 :
1 2 5 10
Explanation of Sample Input 1:
The divisors of 10 are 1,2,5,10.
*/
import java.util.Scanner;
class Printalldivisors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();

		System.out.println("The divisors of 10 are ");
		for (int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
}
/*
OUTPUT
Enter the Number :10
The divisors of 10 are
1 2 5 10

Enter the Number :6
The divisors of 10 are
1 2 3 6
*/