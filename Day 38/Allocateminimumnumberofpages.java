/*
You have N books, each with A[i] number of pages. M students need to be allocated contiguous books, with each student getting at least one book.
Out of all the permutations, the goal is to find the permutation where the sum of maximum number of pages in a book allotted to a student should be minimum, out of all possible permutations.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in 
following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113,
which is selected as the output.
*/
class Allocateminimumnumberofpages{
	static int findAllocateminimumnumberofpages(int arr[],int m){
		if(m>arr.length){
			return -1;
		}
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max,arr[i]);
			sum+=arr[i];
		}
		int low=max,high=sum;
		while(low<=high){
			int mid=(low+high)/2;
			int noofstudent=findStudent(arr,mid);
			if(noofstudent>m){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return low;
	}
	static int findStudent(int arr[],int mid){
		int student=1,pagesStudent=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]+pagesStudent<=mid){
				pagesStudent+=arr[i];
			}else{
				student++;
				pagesStudent=arr[i];
			}
		}
		return student;
	}

	public static void main(String[] args) {
		int arr[]={12,34,67,90};
		int m=2;
		System.out.println(findAllocateminimumnumberofpages(arr,m));
	}
}
/*
OUTPUT
113
*/