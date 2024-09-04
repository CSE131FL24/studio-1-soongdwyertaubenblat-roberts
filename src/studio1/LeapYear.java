package studio1;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
	System.out.println("What is the Year");
	int year = in.nextInt();
	
	boolean divByfour = (year % 4 == 0);
	boolean divByhundred = (year % 100 != 0);
	boolean divByfourhundred = (year % 400 == 0);
	boolean isLeapyear = ((divByfour && divByhundred)|| (divByfourhundred&&divByfour));

	

	System.out.println("The year "+ year + " is a leap year: "+ isLeapyear);
		
		
	}

}
