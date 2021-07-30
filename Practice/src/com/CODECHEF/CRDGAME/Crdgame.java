package com.CODECHEF.CRDGAME;

import java.util.Scanner;

/**
 * @author Erfan
 */
public class Crdgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        while(testCase>0) {
            
            int n = sc.nextInt();
            int chefPoint = 0;
            int mortyPoint = 0;
            
            while(n>0) {
                
                int chefCardScore = 0;
                int mortyCardScore = 0;
                int chefCard = sc.nextInt();
                int mortyCard = sc.nextInt();
                
                while(chefCard > 9) {
                    chefCardScore = chefCardScore + (chefCard % 10);
                    chefCard = chefCard/10;
                }
                chefCardScore = chefCardScore + chefCard;
                
                while(mortyCard > 9) {
                    mortyCardScore = mortyCardScore + (mortyCard % 10);
                    mortyCard = mortyCard/10;
                }
                mortyCardScore = mortyCardScore + mortyCard;               
                
                if(chefCardScore > mortyCardScore) {
                    chefPoint++;
                }
                if(chefCardScore < mortyCardScore) {
                    mortyPoint++;
                }
                
                n--;
            }
            
            if(chefPoint > mortyPoint) {
                System.out.println("0 " + chefPoint);
            }
            else if(chefPoint < mortyPoint) {
                System.out.println("1 " + mortyPoint);
            }
            else {
                System.out.println("2 " + chefPoint);
            }
            
            testCase--;
        }
    }
 
}
