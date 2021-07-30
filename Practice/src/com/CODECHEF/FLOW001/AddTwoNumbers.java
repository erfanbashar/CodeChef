package com.CODECHEF.FLOW001;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int result;
		
		if(t>=1 && t<=1000) {
			for(int i=0; i<t; i++) {
				result = 0;
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if((a>=0 && a<=10000) && (b>=0 && b<=10000)) {
					result = a+b;
				}
				else {
					break;
				}
				System.out.println(result);
			}
		}
	}
}
