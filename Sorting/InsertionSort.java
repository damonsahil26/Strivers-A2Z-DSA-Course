package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {13,46,108,24,52,20,9,1};
        int j =0;
        for(int i = 1; i < arr.length ; i++){
            j = i;
            while( j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
