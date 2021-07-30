package com.CODECHEF.FLOW007;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int n;
		
		while(t>=1 && t<=1000) {
			n = scanner.nextInt();
			int tempN = n;
			String result = "";
			while(n>=1 && n<=1000000) {
				result = result + (n%10);
				n = n/10;
			}
			if(tempN>=1 && tempN<=1000000) {
				System.out.println(Integer.parseInt(result));
			}
			t--;
		}
		
	}
}
