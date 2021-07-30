package com.CODECHEF.LEPERMUT;

import java.util.Scanner;

/**
 * @author erfan26173
 */
public class LittleElephantPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        while(testCase > 0) {
            int inversionCount = 0;
            int locInversionCount = 0;
            int permSize = sc.nextInt();
            int[] permArray = new int[permSize];
            
            for (int i=0;i<permSize; i++) {
                permArray[i] = sc.nextInt();
            }
            
            for(int i=0; i<permSize; i++) {
                if(i<permSize-1 && permArray[i] > permArray[i+1]) {
                    inversionCount++;
                }
                for(int j=i+1; j<permSize; j++) {
                    if(permArray[i] > permArray[j]) {
                        locInversionCount++;
                    }
                }
                
            }
            
            if(inversionCount == locInversionCount) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            
            testCase--;
        }
    }
}
