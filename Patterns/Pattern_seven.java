package Patterns;

import java.util.Scanner;

public class Pattern_seven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = 1; i <= num; i++) {
            for (int k = i; k <= num - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int l = i; l <= num - 1; l++) {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
