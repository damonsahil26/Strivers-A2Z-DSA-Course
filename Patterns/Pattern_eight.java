package Patterns;

import java.util.Scanner;

public class Pattern_eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = num; i > 0; i--) {
            // Spaces Left
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
