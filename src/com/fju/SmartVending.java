package com.fju;

import java.util.Scanner;

public class SmartVending {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int n = -1;
		while(n != 0) {
			System.out.println("Please insert coin/choose? ");
			String s = scanner.next();
			n = Integer.parseInt(s);
			if (n==1 || n==5 || n==10) {
				total = total + n;
				System.out.println("Totol: " + total);
				if (total > 15) {
					System.out.println("a) $10");
				}
				if (total > 20) {
					System.out.println("b) $20");
				}
				if (total > 23) {
					System.out.println("c) $23");
				}
			}
		}
		System.out.println("Bye");
	}

}
