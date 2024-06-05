package Patterns;

import java.util.Scanner;

public class Pattern_twelve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        s.close();

        for(int i = 1; i <= num; i++){
            //First numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //First Spaces
            for(int k = 1; k <= num - i; k++){
                System.out.print(" ");
            }
            //Second Spaces
            for(int l = 1; l <= num - i; l++){
                System.out.print(" ");
            }
            //Second numbers
            for (int m = i; m > 0; m--) {
                System.out.print(m);
            }

            System.out.println("");
        }
    }
}
