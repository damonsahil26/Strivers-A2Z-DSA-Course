package Patterns;

import java.util.Scanner;

public class Pattern_twenty {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        // Top Pattern
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            
            for (int k = 0; k < num-i-1; k++) {
                System.out.print(" ");
            }

            for (int k = 0; k < num-i-1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    
        //Below Pattern
        for (int i = 0; i < num; i++) {
            for (int j = num-i; j > 0; j--) {
                System.out.print("*");
            }
            
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = num-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
