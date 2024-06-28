package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        long fact = new Factorial().findFactorial(num);
        System.out.println(fact);
    }

    public long findFactorial(int n){
        if(n == 0)
        return 1;

        if(n == 1)
        return 1;

       return n * findFactorial(n-1);
    }
}
