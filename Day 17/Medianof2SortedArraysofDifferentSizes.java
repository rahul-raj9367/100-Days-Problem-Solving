/*
Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
*/
import java.util.*;
class Medianof2SortedArraysofDifferentSizes{
	static double findMedianof2SortedArraysofDifferentSizes(int arr1[],int arr2[],int n,int m){
		int arr3[]=new int[n+m];
		int k=0;

		for(int i=0;i<n;i++){
			arr3[k]=arr1[i];
			k++;
		}

		for(int i=0;i<m;i++){
			arr3[k]=arr2[i];
			k++;
		}

		Arrays.sort(arr3);//[1,2,3,5,6,7,9]
		double middle;
		if((n+m)%2==0){
			middle=(arr3[(n+m)/2-1]+arr3[(n+m)/2])/2.0;
		}else{
			middle=arr3[(n+m)/2];
		}
		return middle;
	}
	public static void main(String[] args) {
		int arr1[]={4,6};
		int arr2[]={1,2,3,5};

		int n=2,m=4;

		double result= findMedianof2SortedArraysofDifferentSizes(arr1,arr2,n,m);
		System.out.println(result);

	}
}
/*
OUTPUT
5.0

3.5
*/
