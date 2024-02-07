/*
Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 

The problem is to find the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.

Example 1:
Input:
n = 5
k = 3
arr[] = {5,10,30,20,15}
Output: 35
Explanation: The most optimal way will be:
Painter 1 allocation : {5,10}
Painter 2 allocation : {30}
Painter 3 allocation : {20,15}
Job will be done when all painters finish
i.e. at time = max(5+10, 30, 20+15) = 35
*/
class ThePaintersPartitionProblem{
	static long f(int arr[],long mid,int m){
        long pages =0;
        long student=1;
        
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=mid){
                pages+=arr[i];
            }
            else{
                student++;
                pages = arr[i];
            }
        }
        return student;
    }
    static long minTime(int[] arr,int n,int M){
        //code here
        long sum = 0;
        long max =0;
        for(int i=0;i<n;i++){
            sum+= arr[i]; 
            max = Math.max(arr[i],max);
        }
        
        long low = max;
        long high =sum;
     
        while(low<=high){
            long mid = low + (high-low)/2;
            long noOfStudent = f(arr,mid,M);
            
            if((int)noOfStudent>M){
                low =mid+1;
            }
            else{
               
                high =mid-1;
            }
        }
        return low;
    }
	public static void main(String[] args) {
		int n = 5,k = 3,arr[] = {5,10,30,20,15};
		System.out.println(minTime(arr,n,k));	
	}
}
/*
OUTPUT
35
*/