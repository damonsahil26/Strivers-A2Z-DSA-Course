package Recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    int count = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        s.close();
        new PrintNameNTimes().printGfg(num);
    }

    public void printGfg(int N) {
        // code here
        if(count == N)
        return;
        
        count++;
        System.out.print("SAHIL ");
        printGfg(N);
    }
}
