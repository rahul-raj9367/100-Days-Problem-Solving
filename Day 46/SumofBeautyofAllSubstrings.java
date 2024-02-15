/*
The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.


Example 1:
Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
Example 2:
Input: s = "aabcbaa"
Output: 17
*/
class SumofBeautyofAllSubstrings{
	static int findSumofBeautyofAllSubstrings(String s){
		int ans=0;
		int n=s.length();
		for(int i=0;i<s.length();i++){
			int freq[]=new int[26];
			for(int j=i;j<s.length();j++){
				freq[s.charAt(j)-'a']++;
				int max=getMax(freq);
				int min=getMin(freq);

				int beauty=max-min;
				ans+=beauty;
			}
		}
		return ans;
	}
	static int getMax(int freq[]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<26;i++){
			if(freq[i]!=0)
				max=Math.max(max,freq[i]);
		}
		return max;
	}
	static int getMin(int freq[]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<26;i++){
			if(freq[i]!=0)
				min=Math.min(min,freq[i]);
		}
		return min;
	}
	public static void main(String[] args) {
		String s="aabcb";
		System.out.println(findSumofBeautyofAllSubstrings(s));
	}
}
/*
OUTPUT
5
*/