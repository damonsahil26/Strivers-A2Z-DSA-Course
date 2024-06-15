package Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.close();

        int result = (int)Math.log10(num) + 1;

        System.out.println(result);
    }
}
