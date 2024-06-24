package Maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        int originalNumber = num;

        int totalDigits = (int) Math.log10(num) + 1;
        int sum = 0;
        while(num > 0){
            int currentNum = num % 10;
            sum+= Math.pow(currentNum, totalDigits);
            num = num / 10;
        }

        if(sum == originalNumber)
        System.out.println(originalNumber + " is an Armstrong Number");
        else
        System.out.println(originalNumber + " is NOT an Armstrong Number");
    }
}
