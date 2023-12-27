/* You are given two integer numbers, the base a and the index b. You have to find the last digit of ab.
Input:
 a = "3", b = "10"
 Output:
 9
 Explanation:
 310 = 59049. Last digit is 9.*/
class Findlastdigit{
	public static void main(String[] args) {
     String a="3";
     String b="10";

     int base=Integer.parseInt(a);
     int exponent=Integer.parseInt(b);

     int result=(int)Math.pow(base,exponent);

     int lastDigit =result%10;

     System.out.println("Last Digit: "+lastDigit );
    }
}

/*
OUTPUT
Last Digit: 9
*/