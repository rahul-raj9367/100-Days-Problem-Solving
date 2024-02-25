/*
Given a string, the task is to count all palindromic sub-strings present in it. Length of palindrome sub-string must be greater than or equal to 2. 

Example

Input
N = 5
str = "abaab"
Output
3
Explanation:
All palindrome substring are : "aba" , "aa" , "baab"
Example

Input
N = 7
str = "abbaeae"
Output
4
Explanation:
All palindrome substring are : "bb" , "abba" ,"aea",
"eae"
*/
class CountPalindromeSubStringsofaString{
	static int findCountPalindromeSubStringsofaString(String s){
		int ans=0;
		for(int i=0;i<=s.length();i++){
			for(int j=i+1;j<s.length()+1;j++){
				if(isPalidrome(s.substring(i,j))==true){
					if(s.substring(i,j).length()>=2){
						ans++;
					}
				}
			}
		}
		return ans;
	}
	static boolean isPalidrome(String s){
		int i=0,j=s.length()-1;
		while(i<j){
			if(s.charAt(i++)!=s.charAt(j--)){
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		String str = "abaab";
		System.out.println(findCountPalindromeSubStringsofaString(str));
	}
}
/*
OUTPUT
3
*/