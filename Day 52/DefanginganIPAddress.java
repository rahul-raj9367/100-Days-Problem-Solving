/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/
import java.util.*;
class DefanginganIPAddress{
	static String findDefanginganIPAddress(String address){
		StringBuilder sb= new StringBuilder();
		for(char c:address.toCharArray()){
			if(c=='.'){
				sb.append("[.]");
			}else{
				sb.append(c);
			}
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		String address="1.1.1.1";
		System.out.println(findDefanginganIPAddress(address));
	}
}
/*
OUTPUT
1[.]1[.]1[.]1
*/