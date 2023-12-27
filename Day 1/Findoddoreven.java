//Given a positive integer N, determine whether it is odd or even.
import java.util.Scanner;
class Findoddoreven{
	 	Findoddoreven(int n){
		if(n%2==0){
			System.out.println(n+" is a even Number");
		}
		else{
			System.out.println(n+" is a odd Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n = sc.nextInt();
		if(n<=0){
			System.out.println("Please Enter a positive Number ");
			System.exit(0);
		} 
		new Findoddoreven(n);//call the Constructor 
	}
}
/*
OUTPUT
Enter the Number :-1
Please Enter a positive Number


Enter the Number :5
5 is a odd Number

Enter the Number :8
8 is a even Number



*/