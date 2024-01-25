/*
Given an array. The task is to generate and print all of the possible subsequences of the given array using recursion.

Input : [1, 2, 3]
Output : [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3], []

Input : [1, 2]
Output : [2], [1], [1, 2], []

*/
import java.util.*;
class GeneratingallpossibleSubsequences{
	static void findGeneratingallpossibleSubsequences(int index,int arr[],ArrayList<Integer> list){
		
		if(index>=arr.length){
			System.out.println(list);
		}else{
			list.add(arr[index]);
			findGeneratingallpossibleSubsequences(index+1,arr,list);
			list.remove(list.size()-1); 
			findGeneratingallpossibleSubsequences(index+1,arr,list);
		}

	}
	public static void main(String[] args) {
		int arr[]={1,2,3};
		ArrayList<Integer> list=new ArrayList<>();
		findGeneratingallpossibleSubsequences(0,arr,list);

	}
}
/*
OUTPUT
[1, 2, 3]
[1, 2]
[1, 3]
[1]
[2, 3]
[2]
[3]
[]
*/