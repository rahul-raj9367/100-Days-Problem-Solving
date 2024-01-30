/*
Given a string S. The task is to find all permutations (need not be different) of a given string.

Note: return the permutations in lexicographically increasing order.

Example 1:

Input:
S = AAA
Output: AAA AAA AAA AAA AAA AAA
Explanation: There are total 6 permutations, as given in the output.
*/
import java.util.*;

class StringPermutations{
    private static void findPermutations(int index, char[] arr, List<String> ans) {
        if (index == arr.length) {
            ans.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            findPermutations(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    static void swap(int i, int j, char[] arr) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        String str = "ABC";
        char[] arr = str.toCharArray();
        List<String> ans = new ArrayList<>();
        findPermutations(0, arr, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
