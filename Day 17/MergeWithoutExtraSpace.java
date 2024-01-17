/*
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.
*/
import java.util.*;
class MergeWithoutExtraSpace{
	public static void main(String[] args) {
		int arr1[]={0,1,2,3};
		int arr2[]={5,6,7,8,9};
		int n=4;
		int m=5;

		int arr3[]=new int[n+m];
		int k=0;

		for(int i=0;i<n;i++){
			arr3[k]=arr1[i];//[0,1,2,3]
			k++;
		}

		for(int i=0;i<m;i++){
			arr3[k]=arr2[i];//[5,6,7,8,9]
			k++;
		}

		Arrays.sort(arr3);//[0,1,2,3,5,6,7,8,9]

		for(int i=0;i<n;i++){
            arr1[i]=arr3[i];
        }
        
        for(int i=n;i<n+m;i++) {
            arr2[i-n]=arr3[i];
        }

		for(int i=0;i<n;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i=0;i<m;i++) {
            System.out.print(arr2[i]);
        }
	}
}
/*
OUTPUT
0123
56789
*/