/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

Example 3:
Input: piles = [30,11,23,4,20], h = 6
Output: 23
*/
class KokoEatingBananas{
	static int findMax(int arr[]){
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			ans=Math.max(ans,arr[i]);
		}
		return ans;
	}
	static int findHour(int arr[],int mid){
		int totalhrs=0;
		for(int i=0;i<arr.length;i++){
			totalhrs+=Math.ceil((double)arr[i]/(double)mid);
		}
		return totalhrs;
	}
	static int findKokoEatingBananas(int arr[],int h){
		int low=1,high=findMax(arr);
		int ans=Integer.MAX_VALUE;
		while(low<=high){
			int mid=(low+high)/2;
			int hr=findHour(arr,mid);
			if(hr<=h){
				ans=mid;
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]={3,6,7,11};
		int h=8;
		System.out.println(findKokoEatingBananas(arr,h));
	}
}
/*
OUTPUT
4
*/