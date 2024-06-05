package Patterns;

import java.util.Scanner;

public class Pattern_fourteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        s.close();
        int asciiStart = 65;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j+asciiStart) + " ");
            }
            System.out.println("");
        }

    }
}
