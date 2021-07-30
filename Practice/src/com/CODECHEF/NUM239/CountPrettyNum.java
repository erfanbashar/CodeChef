package com.CODECHEF.NUM239;

import java.util.Scanner;

/**
 * @author erfan26173
 */
public class CountPrettyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count;
        
        while(t>0) {
            count = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int i=l; i<=r; i++) {
                if(i%10==2 || i%10==3 || i%10==9) {
                    count++;
                }
            }
            t--;
            System.out.println(count);
        }
    }
}
