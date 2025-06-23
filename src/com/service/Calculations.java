package com.service;

import java.util.Scanner;

public class Calculations {
	
	
	Scanner sc=new Scanner(System.in);
	
	public int addition() {
		System.out.println("Enter numbers to add (type -1 to stop):");
		int sum=0;
		while(true) {
			int sumInput=sc.nextInt();
			if(sumInput==-1) break;
			sum=sum+sumInput;
		}
		return sum;
		
	}
	
	public int subtraction() {
		System.out.println("Enter numbers to subtract (type -1 to stop):");
		int sub = 0;
		int subInput=sc.nextInt();
		sub= subInput;
		while(true) {
		    subInput=sc.nextInt();
			if(subInput==-1) break;
			 sub=sub-subInput;
		}
		return sub;
		
	}
	
	public int multiplication() {
		
		System.out.println("Enter numbers to multiply (type -1 to stop):");
		int multi=1;
		boolean hasInput = false;
		int multiInput=0;
		while(true) {
			multiInput=sc.nextInt();
			if(multiInput==-1) break;
			multi=multi*multiInput;
			hasInput=true;
		}
		 return hasInput ? multi :0;
	}
	
	public float division() {
		System.out.println("Enter numbers to Divide (type -1 to stop):");
		float div=0;
		int divInput=sc.nextInt();
		div=divInput;
		while(true) {
			divInput=sc.nextInt();
			if(divInput==-1)break;
			if(divInput==0) {
				System.out.println("Cannot divide by 0");
			}
			else {
				div=div/divInput;
			}
		}
		return div;
	}
	

}
