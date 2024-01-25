/*
You are given a 2D 0-indexed integer array dimensions.

For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.

Input: dimensions = [[9,3],[8,6]]
Output: 48
Explanation: 
For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.
*/
class MaximumAreaofLongestDiagonalRectangle{
	public static void main(String[] args) {
		int arr[][]={
			{9,3},
			{8,6}
		};

		double d=0d;
		int res=0;

		for(int val[]:arr){
			int r=val[0],c=val[1];
			double curr=Math.sqrt(r*r+c*c);
			if(d<curr){
				d=curr;
				res=r*c;
			}else if(d == curr){
			    res = Math.max(res, r*c);
		    }
		}

		System.out.println(res);
		

	}
}
/*
OUTPUT
48
*/