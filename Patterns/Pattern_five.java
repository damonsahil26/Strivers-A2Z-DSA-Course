package Patterns;

import java.util.Scanner;

public class Pattern_five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }
}
