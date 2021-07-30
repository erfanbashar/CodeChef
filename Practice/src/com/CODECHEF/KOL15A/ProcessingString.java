package com.CODECHEF.KOL15A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Erfan
 */
public class ProcessingString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        
        while(testCase>0) {
            
            String inpStr = br.readLine();
            int result = 0;
            
            for(int i=0; i<inpStr.length(); i++) {
                if(Character.isDigit(inpStr.charAt(i))) {
                    result = result + Character.getNumericValue(inpStr.charAt(i));
                }
            }
            
            System.out.println(result);
            testCase--;
        }
    }
}
