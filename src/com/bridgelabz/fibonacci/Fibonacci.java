package com.bridgelabz.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	
		Fibonacci fb =  new Fibonacci(); 
		
		int prev = 0;
		int current = 1; 
		
		System.out.println("How many elements you want to print of fibonacci series?");
		
		Scanner sc = new Scanner (System.in); 
		
		int count = sc.nextInt(); 
		fb.printFibonacciNumbers(prev, current, count);
		sc.close();
		
	}
	
	private int printFibonacciNumbers(int prev, int current, int count) {
		if (count == 0) {
			return 0;
		} else {
			System.out.print(prev + "\t");
		}
		
		return printFibonacciNumbers(current, prev + current, --count); 
		
	}
}
