/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
*/
class ReverseWordsinaStringIII{
	static String findReverseWordsinaStringIII(String s){
		StringBuilder sb=new StringBuilder();
        String arr[]=s.split(" ");
        for(String word:arr){
            StringBuilder r=new StringBuilder(word).reverse();
            sb.append(r).append(" ");
        }

        return sb.toString().trim();

	}
	public static void main(String[] args) {
		String s="Let's take LeetCode contest";
		System.out.println(findReverseWordsinaStringIII(s));
	}
}
/*
OUTPUT
s'teL ekat edoCteeL tsetnoc
*/