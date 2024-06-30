package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {13,46,108,24,52,20,9,1};

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
