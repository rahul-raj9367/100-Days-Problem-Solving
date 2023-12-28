/*
For a given 3 digit number, 
find whether it is armstrong number or not.
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
*/
import java.util.Scanner;
class Armstrong{
	static int armstrong(int n,int d){
		int val=n,sum=0;

		while(n>0){
			int r=n%10;
			sum=sum+(int)Math.pow(r,d);
			n=n/10;
		}
		return sum;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number :");
		int num=sc.nextInt();

		int digit=0,temp;

		temp=num;

		while(num>0){
			num=num/10;
			digit++;
		}

		int result=armstrong(temp,digit);
		
		if(temp==result){
			System.out.println(temp+ " is an Armstrong number");
		}
		else{
			System.out.println(temp+ " is Not a Armstrong number");
		}
	}
}
/*
OUTPUT
Enter your Number :153
153 is an Armstrong number


Enter your Number :123
123 is Not a Armstrong number
*/