package com.CODECHEF.FLOW004;

import java.util.Scanner;

public class FirstLastDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int n, sum, lastNum, firstNum;
		while(t>=1 && t<=1000) {
			n = scanner.nextInt();
			sum = 0;
			firstNum = n;
			lastNum = n%10;
			while(n>=10) {
				n = n/10;
			}
			
			sum = n+lastNum;
			System.out.println(sum);
			
			t--;
		}
	}
}
