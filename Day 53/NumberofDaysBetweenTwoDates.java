/*
Write a program to count the number of days between two dates.

The two dates are given as strings, their format is YYYY-MM-DD as shown in the examples.


Example 1:
Input: date1 = "2019-06-29", date2 = "2019-06-30"
Output: 1

Example 2:
Input: date1 = "2020-01-15", date2 = "2019-12-31"
Output: 15
*/
class NumberofDaysBetweenTwoDates{
	static int findNumberofDaysBetweenTwoDates(String date1,String date2){
		String s1[]=date1.split("-");
		String s2[]=date2.split("-");

		return (int)Math.abs(
			daysFrom1971(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),Integer.parseInt(s1[2]))-
			daysFrom1971(Integer.parseInt(s2[0]),Integer.parseInt(s2[1]),Integer.parseInt(s2[2]))
		);
	}
	static int daysFrom1971(int year,int month,int day){
		int total=0;
		total+=(year-1971)*365;
		System.out.println(total+" 1");
		for(int i=1972;i<year;i+=4){
			if(isLeapYear(i)){
				total++;
			}
		}
		System.out.println(total+" 2");

		int feb=isLeapYear(year)?29:28;
		switch (month) {
            case 12: 
                total += 30; // 11
            case 11:
                total += 31; // 10
            case 10: 
                total += 30; // 9
            case 9:
                total += 31; // 8
            case 8:
                total += 31; // 7
            case 7: 
                total += 30; // 6
            case 6:
                total += 31; // 5
            case 5:
                total += 30; // 4
            case 4: 
                total += 31; // 3
            case 3: 
                total += feb; // 2
            case 2:
                total += 31;
            case 1:
                total += day;                
        }
        System.out.println(total+" 3");
        return total;

	}
	static boolean isLeapYear(int i){
		return (i%4==0) && ((i%400==0 && i%100==0) || i%100!=0);
	}
	public static void main(String[] args) {
		String date1 = "2019-06-29", date2 = "2019-06-30";
		System.out.println(findNumberofDaysBetweenTwoDates(date1,date2));
	}
}
