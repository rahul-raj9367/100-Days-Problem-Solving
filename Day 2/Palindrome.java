/*
Given an integer, check whether it is a palindrome or not. 

Input: n = 555
Output: Yes

Input: n = 123
Output: No
*/
import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0){
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}

		if(temp==sum){
			System.out.println(temp+ " is an Palindrome number");
		}
		else{
			System.out.println(temp+ " is Not a Palindrome number");
		}
	}
}
/*
OUTPUT
Enter the Number :555
555 is an Palindrome number

Enter the Number :123
123 is Not a Palindrome number
*/