package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40};
        int n = arr.length;
        reverseArray(arr, n, 1);
    }

    public static void reverseArray(int arr[], int n, int i){
        if(i > n)
        return;

        System.out.print(arr[n-1] + " ");
        reverseArray(arr, n-1, i++);
    }
}
