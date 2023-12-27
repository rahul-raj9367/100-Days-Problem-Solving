/*
Given two positive integers A and B, find GCD of A and B.

Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
*/
class GCD{
	static int FindGcd(int x,int y){
		while(y!=0){
			int temp=y;
			y=x%y;
			x=temp;
		}
		return x;
	}
	public static void main(String[] args) {
	//Method 1 
	// int n1=12, n2=18;  
	// while(n1!=n2)   
	// {  
	// if(n1>n2)  
	// n1=n1-n2;  
	// else  
	// n2=n2-n1;  
	// }  
	// System.out.printf("GCD of n1 and n2 is: " +n2);  

		//method-2
		int a=12,b=18;
		int result=FindGcd(a,b);
		System.out.println("output :"+result);
	}
}
/*
OUTPUT
output :6
*/