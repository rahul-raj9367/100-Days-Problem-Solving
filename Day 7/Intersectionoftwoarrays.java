/*
Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays.
*/
import java.util.HashSet;
class Intersectionoftwoarrays{
	static int checkIntersectionoftwoarrays(int a[],int n,int b[],int m){
		// int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(a[i]==b[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;

		HashSet<Integer> set= new HashSet<>();
		int count=0;
		for(int i=0;i<n;i++){
			set.add(a[i]);
		}

		for(int j=0;j<m;j++){
			if(set.contains(b[j])){
				count++;
			}

			setA.remove(b[j]);
		}

		return count;


	}
	public static void main(String[] args) {
		int a[] = {89, 24, 75, 11, 23};
		int b[] = {89, 2, 4};
		int n=5,m=3;

		int c=checkIntersectionoftwoarrays(a,n,b,m);
		System.out.println(c);
	}
}
/*
OUTPUT
1
*/