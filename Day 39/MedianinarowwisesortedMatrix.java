/*
Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.

Example 1:
Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives 
us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median.
*/
class MedianinarowwisesortedMatrix{
	static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            
            merge(arr,low,mid,high);
            
        }
    }
    static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        
        int leftarr[]=new int[n1];
        int rightarr[]=new int[n2];
        
        for(int i = 0; i < n1; i++){
            leftarr[i] = arr[low + i];
        }

        for(int j = 0; j < n2; j++){
            rightarr[j] = arr[mid + j + 1];
        }
                
        int i=0,j=0,k=low;
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
   static int findMedianinarowwisesortedMatrix(int matrix[][], int R, int C) {
        // code here    
        int temp[]=new int[R*C];
        int k=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                temp[k++]=matrix[i][j];
            }
        }
        
        mergeSort(temp,0,temp.length-1);
        int ans;
        if(temp.length%2==0){
            ans=(temp[(temp.length)/2-1]+temp[(temp.length)/2])/2;
        }else{
            ans=temp[temp.length/2];
        }
        return ans;
    }
	public static void main(String[] args) {
		int mat[][]={
			{1, 3, 5},
			{2, 6, 9},
			{3, 6, 9},
		};
		int r=3,c=3;
		System.out.println(findMedianinarowwisesortedMatrix(mat,r,c));
	}
}
/*
OUTPUT
5
*/