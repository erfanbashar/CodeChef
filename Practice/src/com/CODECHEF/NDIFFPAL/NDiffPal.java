package com.CODECHEF.NDIFFPAL;

import java.util.Scanner;

/**
 * @author Erfan
 */
public class NDiffPal {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            for(int i=0;i<n/26;i++)
             System.out.print("abcdefghijklmnopqrstuvwxyz");

            for(int i=0;i<n%26;i++)
                System.out.print((char)(i+97));

            System.out.println();
        }
    }
}
