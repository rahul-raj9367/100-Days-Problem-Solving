/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. 
Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted.
There can be duplicate elements.

Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation:
a2[] is not a subset of a1[]
*/
class ArraySubset{
	static String findArraySubset(int arr1[],int arr2[],int n,int m){

		int count=0;
		int i,j;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(arr2[i]==arr1[j]){
					count++;
				}
			}
			if(count==m){
				return "Yes";
			}
		}
		return "No";

	}
	public static void main(String[] args) {
		int a1[]= {10, 5, 2, 23, 19};
		int a2[]={19, 5, 3};

		int n=a1.length;
		int m=a2.length;
		String result=findArraySubset(a1,a2,n,m);
		if(result=="Yes"){
			System.out.println("yes,a2[] is a subset of a1[]");
		}else{
			System.out.println("No,a2[] is not a subset of a1[]");
		}
	}
}
/*
OUTPUT
yes,a2[] is a subset of a1[]



No,a2[] is not a subset of a1[]
*/