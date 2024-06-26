package Recursion;

import java.util.Scanner;

public class SumOfFirstN {
    int sum = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        SumOfFirstN obj = new SumOfFirstN();
        obj.findSum(num);
        System.out.println(obj.sum);
    }

     public void findSum(int n){
        if(n == 0)
        return;

        sum+=n;
        n--;
        findSum(n);
    }
}
