/*
Given two arrays A and B contains integers of size N and M, 
the task is to find numbers which are present in the first array, but not present in the second array.

Input: N = 6, M = 5
A[] = {1, 2, 3, 4, 5, 10}
B[] = {2, 3, 1, 0, 5}
Output: 4 10
Explanation: 4 and 10 are present in 
first array, but not in second array.
*/
import java.util.*;
class Findmissinginsecondarray{
	static ArrayList<Long> findmissinginsecondarray(long A[],long B[],int n,int m){
		ArrayList<Long> alist=new ArrayList<>();
		ArrayList<Long> blist=new ArrayList<>();
		ArrayList<Long> list=new ArrayList<>();

		for(int i=0;i<n;i++){
			alist.add(A[i]);
		}

		for(int i=0;i<m;i++){
			blist.add(B[i]);
		}

		HashSet<Long> bset=new HashSet<>(blist);
		for(long val:alist){
			if(!bset.contains(val)){
				list.add(val);
			}
		}
		return list;

	}
	public static void main(String[] args) {
		long A[]={1,2,3,4,5,10};
		long B[]={2,3,1,0,5};
		int n=A.length;
		int m=B.length;

		ArrayList<Long> result=findmissinginsecondarray(A,B,n,m);
		System.out.println(result);
	}
}
/*
OUTPUT
[4, 10]
*/