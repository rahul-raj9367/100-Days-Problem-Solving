/*
Given a list arr of N integers, return sums of all subsets in it.

Input:
N = 2
arr[] = {2, 3}
Output:
0 2 3 5
Explanation:
When no elements is taken then Sum = 0.
When only 2 is taken then Sum = 2.
When only 3 is taken then Sum = 3.
When element 2 and 3 are taken then 
Sum = 2+3 = 5.
*/
import java.util.*;
class SubsetSum{
	static void findSubsetI(int index,int arr[],ArrayList<Integer> list,ArrayList<Integer> summ){
		if(index>=arr.length){
			int sum = 0;
	        for (int num : list) {
	            sum += num;
	        }
	        summ.add(sum);
			return;
		}else{
			list.add(arr[index]);
			findSubsetI(index+1,arr,list,summ);
			list.remove(list.size()-1);
			findSubsetI(index+1,arr,list,summ);
		}
	}
	public static void main(String[] args) {
		int arr[]={2,3};
		ArrayList<Integer> list2= new ArrayList<>();	
		ArrayList<Integer> list= new ArrayList<>();
		findSubsetI(0,arr,list,list2);
		Collections.sort(list2);

		for(int ans:list2){
			System.out.print(ans+" ");
		}
	}
}
/*
OUTPUT
5 2 3 0
*/