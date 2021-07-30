package com.CODECHEF.DECINC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Erfan
 */
public class Decinc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        if(input%4 == 0)
            System.out.println(input++);
        else
            System.out.println(input--);
    }
}
