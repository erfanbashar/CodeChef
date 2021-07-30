package com.CODECHEF.FLOW006;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int result;
		int n;
		
		while(t>=1 && t<=1000) {
			result = 0;
			n = scanner.nextInt();
			
			while(n>0) {
				result += n%10;
				n = n/10;
			}
			
			System.out.println(result);
			
			t--;
		}
	}
}
