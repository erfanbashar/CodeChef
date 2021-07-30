package com.CODECHEF.FCTRL2;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		if(t>=1 && t<=100) {
			for(int i=0; i<t; i++) {
				BigInteger result = new BigInteger("1");
				int n = scanner.nextInt();
				if(n>=1 && n<=100) {
					for(int j=1; j<=n; j++) {
						result = result.multiply(BigInteger.valueOf(j));
					}
				}
				else {
					break;
				}
				System.out.println(result);
			}
		}
	}
	
}
