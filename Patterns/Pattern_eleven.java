package Patterns;

import java.util.Scanner;

public class Pattern_eleven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        s.close();
        for (int i = 0; i < num; i++) {
            int bool = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(bool);
                bool = bool == 1 ? 0 : 1;
            }
            System.out.println("");
        }
    }
}
