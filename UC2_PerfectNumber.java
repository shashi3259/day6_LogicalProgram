package com.bridgelab.LogicalProgram;

import java.util.Scanner;

public class UC2_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<num; i++ ) {
			if(num%i == 0) {
				sum = sum +i;
				System.out.print(i + " + ");
			}
		}
		if(sum == num) {
			System.out.println("\nNumber is perfect number.");
		}
		else {
			System.out.println("\nNumber is not a perfect number.");
		}
		sc.close();
	}
}
