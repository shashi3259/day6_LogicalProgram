package com.bridgelab.LogicalProgram;

import java.util.Scanner;

public class UC3_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2; i<=num; i++) {
			if(num%i == 0) {
				System.out.println(num + " is a prime number.");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
		sc.close();
	}
}
