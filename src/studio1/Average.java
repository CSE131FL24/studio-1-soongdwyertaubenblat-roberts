package studio1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Number"); 
		int n1 = in.nextInt();
		System.out.print("Enter the Second Number"); 
		int n2 = in.nextInt();
		double average =((n1+n2)/2.0);
		System.out.print("The Average of " + n1 + " and " +n2+ " is "+ average);


		
		
	}

}
