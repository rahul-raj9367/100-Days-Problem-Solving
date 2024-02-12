/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
class LongestCommonPrefix{
	static String findLongestCommonPrefix(String str[]){
		if(str.length==0 || str==null){
			return "";
		}

		String prefix=str[0];

		for(int i=1;i<str.length;i++){
			String curretword=str[i];
			int j=0;

			while(j<prefix.length() && j<curretword.length() && prefix.charAt(j) == curretword.charAt(j)){
				j++;
			}

			prefix=prefix.substring(0,j);

			if(prefix.isEmpty()){
				break;
			}
		}
		return prefix;
	}
	public static void main(String[] args) {
		String str[]={"flower","flow","flight"};
		System.out.println(findLongestCommonPrefix(str));
	}
}