/*
Given a number N, check if a number is perfect or not.
A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number. 
Return 1 if the number is Perfect otherwise return 0.

Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.

Input:
N = 10
Output:
0
Explanation:
Factors of 10 are 1, 2, 5 and 10.
Excluding 10 their sum is 8 which
is not equal to N itself. So, it's
not a Perfect Number.
*/
import java.util.Scanner;
class PerfectNumbers{
	static int findperfectnumber(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(n==sum){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();

		int result=findperfectnumber(n);

		System.out.println("Output :"+result);

	}
}

/*
OUTPUT
Enter the Number :6
Output :1

Enter the Number :10
Output :0

*/