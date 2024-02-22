/*
Given a date string in the form Day Month Year, where:

Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
Year is in the range [1900, 2100].
Convert the date string to the format YYYY-MM-DD, where:

YYYY denotes the 4 digit year.
MM denotes the 2 digit month.
DD denotes the 2 digit day.
 

Example 1:
Input: date = "20th Oct 2052"
Output: "2052-10-20"
Example 2:
Input: date = "6th Jun 1933"
Output: "1933-06-06"
Example 3:
Input: date = "26th May 1960"
Output: "1960-05-26"
*/
class ReformatDate{
	static String findReformatDate(String date){
		  String s1[]=date.split(" ");
         for (int i = 0; i < s1.length; i++) {//This code will remove the suffixes "th", "nd", "rd", or "st" 
            s1[i] = s1[i].replaceAll("(?<=\\d)(?:st|nd|rd|th)\\b", "");
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            if(s1[i].equals("Jan")){
                sb.append("01");
                sb.append("-");
            } else if(s1[i].equals("Feb")){
                sb.append("02");
                sb.append("-");
            }else if(s1[i].equals("Mar")){
                sb.append("03");
                sb.append("-");
            }else if(s1[i].equals("Apr")){
                sb.append("04");
                sb.append("-");
            }else if(s1[i].equals("May")){
                sb.append("05");
                sb.append("-");
            }else if(s1[i].equals("Jun")){
                sb.append("06");
                sb.append("-");
            }else if(s1[i].equals("Jul")){
                sb.append("07");
                sb.append("-");
            }else if(s1[i].equals("Aug")){
                sb.append("08");
                sb.append("-");
            }else if(s1[i].equals("Sep")){
                sb.append("09");
                sb.append("-");
            }else if(s1[i].equals("Oct")){
                sb.append("10");
                sb.append("-");
            }else if(s1[i].equals("Nov")){
                sb.append("11");
                sb.append("-");
            }else if(s1[i].equals("Dec")){
                sb.append("12");
                sb.append("-");
            }else if(i==0){
                if(s1[i].length()==1){
                    sb.append("0");
                    sb.append(s1[i]);
                }else{
                    sb.append(s1[i]);
                }
            }
            else{
                sb.append(s1[i]);
                sb.append("-");
            } 
        }

        return sb.toString();
	}
	public static void main(String[] args) {
		String date="20th Oct 2052";
		System.out.println(findReformatDate(date));
	}
}
/*
OUTPUT
2052-10-20
*/