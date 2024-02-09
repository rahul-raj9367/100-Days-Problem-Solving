/*
Nearly everyone has used the Multiplication Table. The multiplication table of size m x n is an integer matrix mat where mat[i][j] == i * j (1-indexed).

Given three integers m, n, and k, return the kth smallest element in the m x n multiplication table.

Input: m = 3, n = 3, k = 5
Output: 3
Explanation: The 5th smallest number is 3.
*/
class KthSmallestNumberinMultiplicationTable{
	static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightarr[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }
    static int KthSmallest(int m, int n, int k) {
        //Write your code here
        int temp[] = new int[m * n];
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[c++] = (i + 1) * (j + 1);
            }
        }

        mergeSort(temp, 0, temp.length - 1);

        return temp[k - 1];
    }
	public static void main(String[] args) {
		int m=3,n=3,k=5;
		System.out.println(KthSmallest(m,n,k));
	}
}
/*
OUTPUT
3
*/