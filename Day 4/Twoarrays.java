/*
Check if two arrays are equal or not
Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

nput:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.
*/
class Twoarrays{
	static boolean findequalornot(int a[],int b[]){
		if(a.length!=b.length){
			return false;
		}
		else{
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]>a[j]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}

			for(int i=0;i<b.length;i++){
				for(int j=i+1;j<b.length;j++){
					if(b[i]>b[j]){
						int temp=b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
		}

		for(int i=0;i<a.length;i++){
			if(a[i]==b[i]){
				return true;
			}
		}

		return false;

	}
	public static void main(String[] args) {
		int a[]={1,2,5,4,0};
		int b[]={2,4,5,0,1};

		boolean result=findequalornot(a,b);
		System.out.println("Output :" + (result ? 1 : 0));//ternary operator

	}
}
/*
OUTPUT

1.Output :1

2.Output :0
*/

