/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, 
then only one occurrence of element should be printed in the union.

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
*/
import java.util.HashSet;
class UniontwoArray{
	static int findUniontwoArray(int a[],int b[],int n,int m){
		HashSet<Integer> set= new HashSet<>();

		for(int i=0;i<n;i++){
			set.add(a[i]);
		}

		for(int j=0;j<m;j++){
			set.add(b[j]);
		}

		return set.size();


	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={1,2,3};
		int n=5,m=3;

		int result = findUniontwoArray(a,b,n,m);
		System.out.println(result);
	}
}
/*
OUTPUT
5
*/