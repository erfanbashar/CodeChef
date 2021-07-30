package com.CODECHEF.CHEFSTR1;

import java.util.Scanner;

/**
 * @author Erfan
 */
public class Chefstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        while(testCase > 0) {
            
            int count = 0;
            int n = sc.nextInt();
            int[] s = new int[n];
            
            for(int i=0; i<s.length; i++) {
                s[i] = sc.nextInt();
            }
            
            for(int i=0; i<s.length-1; i++) {
                count = count + Math.abs(s[i]-s[i+1]) - 1;
            }
            
            System.out.println(count);
            testCase--;
        }
    }
 
}
