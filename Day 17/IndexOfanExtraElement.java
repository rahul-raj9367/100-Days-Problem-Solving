/*
Given two sorted arrays of distinct elements. There is only 1 difference between the arrays. First array has one element extra added in between. Find the index of the extra element

Input:
N = 7
A[] = {2,4,6,8,9,10,12}
B[] = {2,4,6,8,10,12}
Output: 4
Explanation: In the second array, 9 is
missing and it's index in the first array
is 4.
*/
class IndexOfanExtraElement{
	static int findIndexofanExtraElement(int A[],int B[],int N){
		int ans=0;
		for(int i=0;i<N-1;i++){
			if(A[i]!=B[i]){
				ans=i;
				break;
			}else{
				ans=i+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int N = 7;
		int A[] = {2,4,6,8,9,10,12};
		int B[] = {2,4,6,8,10,12};

		int result= findIndexofanExtraElement(A,B,N);
		System.out.println(result);
	}
} 
/*
OUTPUT
4
*/