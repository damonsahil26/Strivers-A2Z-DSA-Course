package Patterns;

import java.util.Scanner;

public class Pattern_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }
}
