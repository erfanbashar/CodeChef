package com.CODECHEF.INTEST;

import java.util.Scanner;

public class Intest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		
		int firstLimit = (int) Math.pow(10, 7);
		int secondLimit = (int) Math.pow(10, 9);
		
		if(n<=firstLimit && k<=firstLimit) {
			for(int i=0; i<n; i++) {
				int t = scanner.nextInt();
				if(t>secondLimit) {
					break;
				}
				if(t%k == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	} 
}
