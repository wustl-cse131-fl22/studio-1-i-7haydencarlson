package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Read and store first input
		
		System.out.print("First number to average: ");
		int integer1 = in.nextInt();
		
		//Read and store second input
		
		System.out.print("Second number to average: ");
		int integer2 = in.nextInt();
		
		//Take average and make into a double 
		
		double average = (((double)integer1 + (double)integer2)/2);
		
		System.out.println("Average of " + integer1 + " and " + integer2 + " is " + average);
		
		
	}

}
