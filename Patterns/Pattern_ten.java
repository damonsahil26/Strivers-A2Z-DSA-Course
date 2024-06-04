package Patterns;

import java.util.Scanner;

public class Pattern_ten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        s.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.err.print("*");
            }
            System.out.println("");
        }
    }
}
