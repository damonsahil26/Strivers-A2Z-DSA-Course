package Patterns;

import java.util.Scanner;

public class Pattern_eighteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = 0; i < num; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char)(65 + (num-j-1)));
            }

            System.out.println("");
        }
    }
}
