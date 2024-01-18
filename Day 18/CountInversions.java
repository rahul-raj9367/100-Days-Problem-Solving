/*
Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
*/
class CountInversions{
	static int mergeAndCount(int arr[],int left,int right){
		int count=0;
		if(left<right){
			int mid=left+(right-left)/2;

			count+=mergeAndCount(arr,left,mid);
			count+=mergeAndCount(arr,mid+1,right);

			count+=merge(arr,left,mid,right);
		}
		return count;
	}

	static int merge(int arr[],int left,int mid,int right){
		int count=0;

		int n1=mid-left+1;
		int n2=right-mid;

		int leftarr[]=new int[n1];
		int rightarr[]=new int[n2];

		for(int i=0;i<n1;i++){
			leftarr[i]=arr[left+i];
		}

		for(int j=0;j<n2;j++){
			rightarr[j]=arr[mid+j+1];
		}

		int i=0,j=0,k=left;

		while(i<n1 && j<n2){
			if(leftarr[i]<=rightarr[j]){
				arr[k]=leftarr[i];
				i++;
			}else{
				arr[k]=rightarr[j];
				j++;
				count+=n1-i;
			}
			k++;
		}

		while(i<n1){
			arr[k]=leftarr[i];
			i++;
			k++;
		}

		while(j<n2){
			arr[k]=rightarr[j];
			j++;
			k++;
		}

		return count;

	}
	public static void main(String[] args) {
		int arr[]={2,4,1,3,5};
		int count=mergeAndCount(arr,0,arr.length-1);
		System.out.println(count);
	}
}
/*
OUTPUT
3
*/