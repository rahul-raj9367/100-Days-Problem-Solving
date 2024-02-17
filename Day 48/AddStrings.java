/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.


Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
*/
import java.util.*;
class AddStrings{
	static String findAddStrings(String num1,String num2){
		// int n1=Integer.valueOf(num1);
        // int n2=Integer.valueOf(num2);
        // int n3=n1+n2;
        // String ans=String.valueOf(n3);

        // return ans;

        // BigInteger n1 = new BigInteger(num1);
        // BigInteger n2 = new BigInteger(num2);
        // BigInteger sum = n1.add(n2);
        // return sum.toString();
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
        	int d1=i>=0?num1.charAt(i)-'0':0;
        	int d2=j>=0?num2.charAt(j)-'0':0;
        	int sum=d1+d2+carry;
        	carry=sum/10;
        	sb.insert(0,sum%10);
        	i--;
        	j--;
        }
        return sb.toString();
	}
	public static void main(String[] args) {
		
        String num1 = "11", num2 = "123";
        System.out.println(findAddStrings(num1,num2));
	}
}
/*
OUTPUT
134
*/