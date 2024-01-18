/*
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.

N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
*/
class MergeSort{
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
    public static void main(String[] args) {
        int arr[]={4,1,3,9,7};
        mergeSort(arr,0,arr.length-1);
        System.out.println("After Sorted Array :");
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
/*
OUTPUT
After Sorted Array :
1 3 4 7 9
*/