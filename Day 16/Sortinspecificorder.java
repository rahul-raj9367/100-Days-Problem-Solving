/*
Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

Input:
N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:
7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd
and sorted in descending order,
whereas 2 4 10 are even numbers
and sorted in ascending order
*/
import java.util.*;
class Sortinspecificorder{
	public static void main(String[] args) {
		int arr[]={1,2,3,5,4,7,10};
		int n=7;

		ArrayList<Integer> odd= new ArrayList<>();
		ArrayList<Integer> even= new ArrayList<>();

		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				even.add(arr[i]);
			}
			else if(arr[i]%2==1){
				odd.add(arr[i]);
			}
		}

		Collections.sort(even);		
		Collections.sort(odd,Collections.reverseOrder());

		int x=0;
		for(int val:odd){
			arr[x]=val;
			x++;
		}

		for(int val:even){
			arr[x]=val;
			x++;
		}

		for(int val:arr){
			System.out.print(val+" ");
		}

	}
}
/*
OUTPUT
7 5 3 1 2 4 10
*/