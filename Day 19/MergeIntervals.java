/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
*/
import java.util.*;
class MergeIntervals{
	static int[][] mergeIntervals(int intervals[][]){
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

		List<int []> result = new ArrayList<>();
		int currentInterval[]=intervals[0];

		for(int i=1;i<intervals.length;i++){
			int nextInterval[]=intervals[i];

			if(currentInterval[1]>=nextInterval[0]){
				currentInterval[1]=Math.max(currentInterval[1],nextInterval[1]);
			}else{
				result.add(currentInterval);
				currentInterval=nextInterval;
			}
		}

		result.add(currentInterval);

		return result.toArray(new int[result.size()][]);

	}
	public static void main(String[] args) {
		int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        int mergeInterval[][]=mergeIntervals(intervals);

        for(int val[]:mergeInterval){
        	System.out.println(Arrays.toString(val));
        }
	}
}
/*
OUTPUT
[1, 6]
[8, 10]
[15, 18]
*/
