/*
Your task  is to implement the function atoi. The function takes a string as an argument and converts it to an integer and returns it. If the string is not numerical, then return -1. Numerical strings are the strings where either every character is in between 0-9 or where the first character is '-' and the rest all characters are in between 0-9.

Note: You are not allowed to use inbuilt function.

Example 1:
Input:
str = 123
Output: 123

Input:
str = 21a
Output: -1
Explanation: Output is -1 as 'a'
can not be converted to integer.
*/
class ImplementAtoi{
	public static int atoi(String str) {
        int result=0;
        int sign=1;
        int i=0;

        if(str.charAt(i)=='-'){
        	sign=-1;
        	i++;
        }

        while(i<str.length()){
        	if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
        		return -1;
        	}

        	result=result*10+(str.charAt(i)-'0');
        	i++;
        }
        return result*sign;
    }
    
    public static void main(String[] args) {
        String str = "123";
        int result = atoi(str);
        System.out.println(result); 
    }
}
/*
OUTPUT

*/