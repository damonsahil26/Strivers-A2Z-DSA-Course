package Patterns;

import java.util.Scanner;

public class Pattern_thirteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        s.close();
        int count = 0;
        for (int i = 0; i < num; i++) {
            for(int j = 0; j<= i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println("");
        }
    }
}
