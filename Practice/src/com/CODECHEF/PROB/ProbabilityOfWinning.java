package com.CODECHEF.PROB;

import java.util.Scanner;

/**
 * @author Erfan
 */
public class ProbabilityOfWinning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        while(testCase>0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int t3 = sc.nextInt();
            int t4 = sc.nextInt();
            
            System.out.println((double)t1/(t1+t2));
            
            testCase--;
        }
    }
}
