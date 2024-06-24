package Maths;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputNum = s.nextInt();
        int num = inputNum, revNum = 0,lastNum = 0;
        s.close();

        while(inputNum > 0){
            lastNum = inputNum % 10;
            inputNum = inputNum / 10;
            revNum =  revNum * 10 + lastNum;
        }

        if(revNum == num){
            System.out.println("It is palindrome!!");
        }
        else{
            System.out.println("It is NOT palindrome.");
        }
    }
}
