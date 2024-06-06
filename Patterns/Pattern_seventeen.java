package Patterns;

import java.util.Scanner;

public class Pattern_seventeen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = 0; i < num; i++) {
           for (int j = 0; j <= num-i-1; j++) {
               System.out.print(" ");
           } 

           for (int l = 0; l <= i; l++) {
               System.out.print((char)(65+l));
           }

           for (int m = i; m > 0; m--) {
               System.out.print((char)(65+m-1));
           }

           System.out.println("");
        }
    }
}
