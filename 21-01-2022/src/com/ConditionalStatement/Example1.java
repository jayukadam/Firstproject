package com.ConditionalStatement;

import java.util.Scanner;

public class Example1 {

	//Nested if-else statement
	public static void main(String[] args) {
		/**
		 *  Write a java program to find the given number is positive or negative,
		 *  if the number is positive then verify that number is even or odd. 				
		 */
				
int number;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter any value(expect 0): ");
 number = scanner.nextInt();
 
//outer if-else
 if(number>0)
 {
	 
	//inner if-else
	 if(number%2 == 0)
	 {
		 System.out.println("number is even: "+number);
	 }
	 else
	 {
		 System.out.println("number is odd:"+number);
	 }
 }
 else
 {
	 System.out.println("number is negative: "+number);
 }
	scanner.close();
			
	}

}
