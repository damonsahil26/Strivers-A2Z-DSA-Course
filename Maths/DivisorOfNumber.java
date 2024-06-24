package Maths;

import java.util.Scanner;

public class DivisorOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        int divisorPossibleUpto = (int)Math.sqrt(num);

        for(int i = 1; i <= divisorPossibleUpto; i++){
            if(num % i == 0)
            System.out.print(+ i + ", ");

             if(i != num / i)
            System.out.print( + num / i + ",");
        }
    }
}
