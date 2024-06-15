package Patterns;

import java.util.Scanner;

public class Pattern_twentyOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        s.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i == 0 || i == num - 1 || j == 0 || j == num - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
