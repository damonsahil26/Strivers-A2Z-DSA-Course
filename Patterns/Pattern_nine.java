package Patterns;

import java.util.Scanner;

public class Pattern_nine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        s.close();

        // Diamond First half
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= 2 * i - 1; l++) {
                System.out.print("*");
            }

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            System.err.println("");
        }

        // Diamond Second half

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
