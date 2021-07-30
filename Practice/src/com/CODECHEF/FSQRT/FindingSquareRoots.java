package com.CODECHEF.FSQRT;

import java.util.Scanner;

public class FindingSquareRoots {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int n;
		
		while(t>=1 && t<=20) {
			n = scanner.nextInt();
			
			if(n>=1 && n<=10000) {
				System.out.println((int) (Math.sqrt(n)));
			}
			
			t--;
		}
	}
}
