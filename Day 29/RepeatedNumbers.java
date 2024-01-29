/*
Given an array with repeated numbers, Find the top three repeated numbers.
input: array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
output: 3, 16, 15
*/
import java.util.*;
// class RepeatedNumbers{
// 	public static void main(String[] args) {
// 		int arr[]={3, 4, 2,16, 3, 15, 16, 15, 15, 16, 2, 3};
// 		int n=arr.length;
// 		int temp[]=new int[n];
// 		int i=0;

// 		while(i<n){
// 			int j=i+1;
// 			int count=1;
// 			while(j<n){
// 				if(arr[i]==arr[j]){
// 					count++;
// 				}
// 				if(count>=3){
// 					temp[i]=arr[i];
// 					break;
// 				}
// 				j++;
// 			}
// 			i++;
// 		}

// 		for(int k=0;k<n-1;k++){
// 			if(temp[k]!=temp[k+1] && temp[k]!=0){
// 				System.out.print(temp[k]+" ");
// 			}
// 		}
// 	}
// }
class RepeatedNumbers {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        int n = arr.length;

        int[] frequency = new int[1000]; // Assuming the range of numbers is within 1000

        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        boolean firstFound = false;
        boolean secondFound = false;
        boolean thirdFound = false;

        for (int i = 0; i < 1000; i++) {
            if (frequency[i] >= 3 && !firstFound) {
                System.out.print(i + " ");
                firstFound = true;
            } else if (frequency[i] >= 3 && !secondFound) {
                System.out.print(i + " ");
                secondFound = true;
            } else if (frequency[i] >= 3 && !thirdFound) {
                System.out.print(i + " ");
                thirdFound = true;
                break; // We only need the top three repeated numbers
            }
        }
    }
}
/*
OUTPUT
3 16 15
*/