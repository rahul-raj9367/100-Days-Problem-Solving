/*
Print a sequence of numbers starting with N, without using loop, where replace N with N - 5, until N > 0. After that replace N with N + 5 until N regains its initial value.

Input: 
N = 16
Output: 
16 11 6 1 -4 1 6 11 16
Explaination: 
The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.
*/
import java.util.*;
class PrintPattern{
	
	static List<Integer> findPrintPattern(int N,ArrayList<Integer> list ){
		if(N <= 0){
            list.add(N);
            return list;
        }
        list.add(N);
        findPrintPattern(N-5,list);
        list.add(N);
        return list;
    }
	public static void main(String[] args) {
		int n=16;
		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> result = findPrintPattern(n,list);
        for (int num : result) {
            System.out.print(num + " ");
        }
		
	}
}
/*
OUTPUT
16 11 6 1 -4 1 6 11 16
*/