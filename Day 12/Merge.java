/*
ZOHO-QUESTION
[3,5,8] [9,6,4]

[3,4,5,6,8,9]

*/
import java.util.*;
class Merge{
	public static void main(String[] args) {
		int a[]={3,5,8};
		int b[]={9,6,4};
		int length=a.length+b.length;

		 TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}

		for(int i=0;i<b.length;i++){
			set.add(b[i]);
		}

		for(int val:set){
			System.out.print(val+" ");
		}
	}
}
/*
OUTPUT
[3,4,5,6,8,9]
*/