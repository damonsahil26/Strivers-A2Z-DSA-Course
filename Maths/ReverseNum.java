package Maths;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.close();
        long lastNum = 0, revNum = 0;
        boolean isNegative = num < 0;
        num = Math.abs(num);
        while(num > 0){
            lastNum = num % 10;
            num = num / 10;
            if(revNum > Integer.MAX_VALUE / 10){
            revNum = 0;
            break;
            }
            revNum = (revNum * 10) + lastNum;
        }

        if(isNegative)
        revNum *= -1; 

        if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE)
        revNum = 0;

        System.out.println("The reverse of is " + revNum);
    }
}
