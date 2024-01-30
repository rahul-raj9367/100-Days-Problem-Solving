/*
Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

Example 1:
Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.

*/
import java.util.*;
class Permutationsofagivenstring{
	static void findPermutationsStringII(int index,char ch[],List<List<String>> ans){
		if(index==ch.length){
			List<String> str= new ArrayList<>();

			for(char i=0;i<ch.length;i++){
				str.add(String.valueOf(ch[i]));
			}

			ans.add(str);
		}

		for(int i=index;i<ch.length;i++){
			if(i>index && ch[i]==ch[i-1]){
				continue;
			}
			swap(i,index,ch);
			findPermutationsStringII(index+1,ch,ans);
			swap(i,index,ch);
		}
	}
	static void swap(int i,int j,char ch[]){
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
	}
	public static void main(String[] args) {
		String str="ABC";
		char ch[]=str.toCharArray();

		List<List<String>> ans= new ArrayList<>();
		findPermutationsStringII(0,ch,ans);
		System.out.println(ans);
	}
}
/*
OUTPUT
[[A, B, C], [A, C, B], [B, A, C], [B, C, A], [C, B, A], [C, A, B]]
*/