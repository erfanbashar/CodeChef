package com.CODECHEF.FLOW002;

import java.util.Scanner;

public class FindRemainder {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int a,b;
		while(t>=1 && t<=1000) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a%b);
			t--;
		}
	}
}
