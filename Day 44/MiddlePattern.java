/*
Given an odd length word your task is to complete the function printPattern that takes a string s as its argument and prints it from the middle of the word such that it follows the following pattern.

Input: PROGRAM 
Output:
G$ GR$ GRA$ GRAM$ 
GRAMP$ GRAMPR$ GRAMPRO$

Input: RAT
Output:
A$ AT$ ATR$

NOTE: 
Corresponding to each test case in a new 
line print the pattern in a  single 
line where each row of the pattern 
is separated by a "$" instead 
of a new line.
*/
import java.util.*;
class MiddlePattern{
	static void findMiddlePattern(String s){

		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s.length();i++){

			for(int j=i+1;j<s.length();j++){
				System.out.print(" ");
			}

			int mid=s.length()/2;

			sb.append(s.charAt((mid+i)%s.length()));
			System.out.print(sb.toString() +"$ ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String s="PROGRAM";
		findMiddlePattern(s);
	}
}
/*
OUTPUT
      G$
     GR$
    GRA$
   GRAM$
  GRAMP$
 GRAMPR$
GRAMPRO$
*/