package com.bridgelab.LogicalProgram;

import java.util.Scanner;

public class UC1_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b =1;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which you want Fibonacci Series: ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c +" ");
		}
		sc.close();
	}
}
