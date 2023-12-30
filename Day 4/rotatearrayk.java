/*
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
//Rotate Left side
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.
*/
import java.util.Scanner;
class rotatearrayk{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the times of rotate Array :");
		int n=sc.nextInt();

		for(int i=0;i<n;i++){
			int first=arr[0];
			for(int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[4]=first;
		}

		System.out.println("After Rotate");

		for(int element:arr){
			System.out.print(element+" ");
		}
	}
}
/*
OUTPUT

enter the times of rotate Array :1
After Rotate
2 3 4 5 1


enter the times of rotate Array :2
After Rotate
3 4 5 1 2

enter the times of rotate Array :3
After Rotate
4 5 1 2 3
*/