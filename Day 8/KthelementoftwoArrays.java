/*
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. 
The task is to find the element that would be at the kth position of the final sorted array.

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
*/
import java.util.*;
class KthelementoftwoArrays{
	static long findKthelementoftwoArrays(int arr1[],int arr2[],int n,int m,int k){

		List<Integer> l= new ArrayList<>();

		for(int i=0;i<n;i++){
			l.add(arr1[i]);
		}

		for(int j=0;j<m;j++){
			l.add(arr2[j]);
		}

		Collections.sort(l);

		long ans=l.get(k-1);

		return ans;
	}
	public static void main(String[] args) {
		int arr1[]={2, 3, 6, 7, 9};
		int arr2[]={1, 4, 8, 10};
		int n=arr1.length;
		int m=arr2.length;
		int k=5;

		long result=findKthelementoftwoArrays(arr1,arr2,n,m,k);
		System.out.println("K-th element is "+result);
	}
}
/*
OUTPUT
K-th element is 6
*/