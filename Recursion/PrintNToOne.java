package Recursion;

import java.util.*;

public class PrintNToOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        new PrintNToOne().printReverse(num);
    }

    public void printReverse(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        n--;
        printReverse(n);
    }
}
