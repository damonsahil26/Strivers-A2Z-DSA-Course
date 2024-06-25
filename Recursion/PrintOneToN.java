package Recursion;

import java.util.Scanner;

public class PrintOneToN {
    int count = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        new PrintOneToN().printNos(num);
    }
    
    public void printNos(int n){
       if(count == n)
       return;

       count++;
       System.out.print(count +" ");
       printNos(n);
    }
}
