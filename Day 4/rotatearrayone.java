/*
Given an array, rotate the array by one position in clock-wise direction
//Rotate Right side
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
*/
class  rotatearrayone{
	public static void main(String[] args) {
		int a[]={9, 8, 7, 6, 4, 2, 1, 3};
		int n=1;//1 time rotate by clock-wise direction
		

		for(int i=0;i<n;i++){
			int last=a[a.length-1];
			for(int j=a.length-1;j>=1;j--){
				a[j]=a[j-1];
			}
			a[0]=last;
		}

		System.out.println("After Rotate");

		for(int element:a){
			System.out.print(element+" ");
		}
	}
}
/*
OUTPUT

After Rotate
5 1 2 3 4

After Rotate
3 9 8 7 6 4 2 1
*/