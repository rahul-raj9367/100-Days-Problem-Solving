/*
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, 
compute how much water can be trapped between the blocks during the rainy season.

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.
*/
class TrappingRainWater{
	static long findTrappingRainWater(int n,int arr[]){
		int l=arr.length;
        long result=0;
        int lb[]= new int[l];
        int rb[] = new int[l];
        
        lb[0]=arr[0];
        for(int i=1;i<arr.length-1;i++){
            lb[i]=Math.max(arr[i],lb[i-1]);
        }
        
        rb[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rb[i]=Math.max(arr[i],rb[i+1]);
        }
        
        for(int i=1;i<arr.length-1;i++){
            result=result+Math.min(lb[i],rb[i])-arr[i];
        }
        
        return result;

	}
	public static void main(String[] args) {
		int n=6;
		int arr[]={3,0,0,2,0,4};

		long result=findTrappingRainWater(n,arr);
		System.out.println(result);
	}
}
/*
OUTPUT
10
*/