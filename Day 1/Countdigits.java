/*
Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
*/

class Countdigits{
	public static void main(String[] args) {
		int num=12,count=0;
		int d1=num%10;//2
		int d2=num/10;//1
		if(num%d1==0){//12%2==0
			count++;
		}
		if(num%d2==0){//12%1==0
			count++;
		}

		System.out.println(count);
	}
}
/*
OUTPUT
2

*/