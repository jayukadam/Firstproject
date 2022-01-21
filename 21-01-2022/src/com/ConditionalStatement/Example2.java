package com.ConditionalStatement;

import java.util.Scanner;

public class Example2 {
	//if-else ladder
	public static void main(String[] args) {

		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR MARKS(*out of 100): ");
		marks = sc.nextInt();
		
		if(marks<100 && marks>70)
		{
			System.out.println("destinction");
		}
		else if(marks<70 && marks>60)
		{
			System.out.println("first class");
		}
		
		else if(marks<60 && marks>50)
		{
			System.out.println("second class");
		}
		else if(marks<50 && marks>41)
		{
			System.out.println("third class");
		}
		else if(marks == 40)
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		sc.close();
	}

}
