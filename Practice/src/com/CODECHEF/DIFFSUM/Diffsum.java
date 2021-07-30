package com.CODECHEF.DIFFSUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Erfan
 */
public class Diffsum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(br.readLine());
        int secondNumber = Integer.parseInt(br.readLine());
        
        if(firstNumber > secondNumber)
            System.out.println(firstNumber-secondNumber);
        else
            System.out.println(firstNumber+secondNumber);
        
    }
}
