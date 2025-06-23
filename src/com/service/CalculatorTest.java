package com.service;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
        Calculations c=new Calculations();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("*Welcome to Calculator App*");
		
		System.out.println(" ");
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		System.out.println(" ");
		
		System.out.println("Please choose the operation you want to perform (1-4): ");
		
		int option=s.nextInt();
		
		switch(option) {
		
		case 1 : 
			int sum=c.addition();
			System.out.println(sum);
			break;
			
        case 2 :
			
			int sub=c.subtraction();
			System.out.println(sub);
			break;
			
        case 3 :
        	int multi=c.multiplication();
        	System.out.println(multi);
        	break;
        	
        case 4 :
			float div=c.division();
			System.out.println(div);
			break;
			
        default:
            System.out.println("Invalid option. Please select between 1 and 4.");
		
		}
		
		s.close();
		
	}

}
