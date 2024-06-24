package Maths;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isPrime = true; 
        int firstDivision = 0;
        int num = s.nextInt();

        int n = (int)Math.sqrt(num);

        for(int i = 2; i <= n; i++){
            if(num % i == 0){
                isPrime = false;
                firstDivision = i;
                break;
            }
        }

        if(isPrime){
            System.out.print("The number " + num + " is Prime.");
        }
        else{
            System.out.print("The number " + num + " is NOT Prime. It is divisble by " + firstDivision);
        }
    }
}
