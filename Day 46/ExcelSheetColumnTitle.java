/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
*/
import java.util.*;
class ExcelSheetColumnTitle{
	static String findExcelSheetColumnTitle(int n){
		StringBuilder sb=new StringBuilder();
		while(n>0){
			n--;
			int rem=n%26;
			char chh=(char)(rem+'A');
			sb.insert(0,chh);
			n=n/26;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n=701;
		System.out.println(findExcelSheetColumnTitle(n));
	}
}
/*
OUTPUT
ZY
*/