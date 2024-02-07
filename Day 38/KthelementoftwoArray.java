/*
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the kth position of the final sorted array.
 

Example 1:
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
class  KthelementoftwoArray{
	static void mergeSort(int arr[],int left,int right){
        if(left<right){

            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    static void merge(int arr[],int left,int mid,int right){
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
    }
    static long kthElement( int arr1[], int arr2[], int n, int m, int c) {
        
        int arr3[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
            k++;
        }
        
        for(int i=0;i<m;i++){
            arr3[k]=arr2[i];
            k++;
        }
        
        mergeSort(arr3,0,arr3.length-1);
        
        return arr3[c-1];
        
    }
	public static void main(String[] args) {
		int arr1[] = {2, 3, 6, 7, 9},arr2[] = {1, 4, 8, 10},c = 5;
		int n=arr1.length,m=arr2.length;
		System.out.println(kthElement(arr1,arr2,n,m,c));
	}
}
/*
OUTPUT
6
*/