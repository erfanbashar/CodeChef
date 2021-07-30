package com.CODECHEF.TOTR;

import java.util.Scanner;

/**
 * @author Erfan
 */
public class TouristTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        String byteLandStr = sc.nextLine(); 
        
        
        while(testCase>0) {
            
            String inpStr = sc.nextLine();
            char[] charArr = new char[inpStr.length()];
            charArr = inpStr.toCharArray();
            String outputStr = "";
            
            for(int i=0; i<charArr.length; i++) {
                int position = 0;
                
                if(charArr[i] == '_') {
                    outputStr = outputStr + " ";
                }
                if(charArr[i] == '.') {
                    outputStr = outputStr + ".";
                }
                if(charArr[i] == ',') {
                    outputStr = outputStr + ",";
                }
                if(charArr[i] == '!') {
                    outputStr = outputStr + "!";
                }
                if(charArr[i] == '?') {
                    outputStr = outputStr + "?";
                }
                if((char)charArr[i] >= 97 && (char)charArr[i] <= 122) {
                    position = (char)(charArr[i]) - 97;
                    outputStr = outputStr + byteLandStr.charAt(position+1);
                }
                if((char)charArr[i] >=65 && (char)charArr[i] <= 90) {
                    position = (char)(Character.toLowerCase(charArr[i])) - 97;
                    outputStr = outputStr + Character.toUpperCase(byteLandStr.charAt(position+1));
                }
                
            }
            
            System.out.println(outputStr);
            testCase--;
        }
    }
}
