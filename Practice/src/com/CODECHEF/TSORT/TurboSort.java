package com.CODECHEF.TSORT;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] array = new int[t];
		
		for(int i=0; i<t; i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int number:array) {
			System.out.println(number);
		}
	}
	
}
