package Patterns;

import java.util.Scanner;

public class Pattern_six {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        s.close();

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print(j);
            }
            System.out.println("");
        }
    }
}
