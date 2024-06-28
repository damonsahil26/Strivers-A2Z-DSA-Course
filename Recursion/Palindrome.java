package Recursion;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        checkPalindrome(str, 0, str.length());
    }

    public static void checkPalindrome(String str, int i, int n){
        if(i == n / 2){
        System.out.print(true);
            return;
        }
        if(str.charAt(i) == str.charAt(n - i - 1)){
            checkPalindrome(str, ++i, n );
        }
        else{
            System.out.print(false);
            return;
        }
    }
}
