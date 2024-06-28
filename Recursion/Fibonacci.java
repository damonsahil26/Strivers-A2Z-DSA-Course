package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;
        int j = 1;
        int count = 1;
        int sum = 0; 

        System.out.print(i + " " + j +" ");
        fib(num, i, j, count, sum);
        s.close();
    }

    public static void fib(int num, int i, int j, int count, int sum){
        count++;
        if(count > num)
        return;

        sum = i + j;
        System.out.print(sum + " ");
        fib(num, j, sum, count, sum);
    }
}
