package Patterns;

import java.util.Scanner;

public class Pattern_twentyTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        for (int i = 0; i < 2 * num -1; i++) {
            for (int j = 0; j < 2 * num - 1; j++) {
                int top = i;
                int bottom = (2 * num - 2) - i;
                int left = j;
                int right = (2 * num - 2) - j;
                int result = num - (Math.min(Math.min(top, bottom),Math.min(left, right))); 
                System.out.print(result+" ");
            }

            System.out.println("");
        }
    }
}
