package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {13,46,108,24,52,20,9,1};

        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
