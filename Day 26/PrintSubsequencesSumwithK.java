/*
Find all subsequences with sum equals to K
Input : [1, 2, 1] sum=2
Output : [1,1] [2]

*/
import java.util.*;
class PrintSubsequencesSumwithK{
	static void findPrintSubsequencesSumwithK(int index,ArrayList<Integer> list,int s,int sum,int arr[]){
		if(index==arr.length){
			if(s==sum){
				System.out.println(list);
			}
		}else{
			list.add(arr[index]);
			s+=arr[index];
			findPrintSubsequencesSumwithK(index+1,list,s,sum,arr);

			list.remove(list.size()-1);
			s-=arr[index];
			findPrintSubsequencesSumwithK(index+1,list,s,sum,arr);
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,1};
		int sum=2;
		ArrayList<Integer> list=new ArrayList<>();
		findPrintSubsequencesSumwithK(0,list,0,sum,arr);

	}
}
/*
OUTPUT
[1, 1]
[2]

//Print count with sum equals to K
class PrintSubsequencesSumwithK{
	static int  findPrintSubsequencesSumwithK(int index,ArrayList<Integer> list,int s,int sum,int arr[]){
		int l,r;
		if(index==arr.length){
			if(s==sum){
				return 1;
			}
			return 0;
		}else{
			list.add(arr[index]);
			s+=arr[index];
			l=findPrintSubsequencesSumwithK(index+1,list,s,sum,arr);

			list.remove(list.size()-1);
			s-=arr[index];
			r=findPrintSubsequencesSumwithK(index+1,list,s,sum,arr);
		}
		return l+r;
	}
	public static void main(String[] args) {
		int arr[]={1,2,1};
		int sum=2;
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(findPrintSubsequencesSumwithK(0,list,0,sum,arr));

	}
}
//Print first with sum equals to K
class PrintSubsequencesSumwithK{
	static boolean  findPrintSubsequencesSumwithK(int index,ArrayList<Integer> list,int s,int sum,int arr[]){
		
		if(index==arr.length){
			if(s==sum){
				System.out.println(list);
				return true;
			}
			return false;
		}
			list.add(arr[index]);
			s+=arr[index];
			if(findPrintSubsequencesSumwithK(index+1,list,s,sum,arr)==true){
				return true;
			}

			list.remove(list.size()-1);
			s-=arr[index];
			if(findPrintSubsequencesSumwithK(index+1,list,s,sum,arr)==true){
				return  true;
			}
		return false;
		
	}
	public static void main(String[] args) {
		int arr[]={1,2,1};
		int sum=2;
		ArrayList<Integer> list=new ArrayList<>();
		findPrintSubsequencesSumwithK(0,list,0,sum,arr);

	}
}
*/