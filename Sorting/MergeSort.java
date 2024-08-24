package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr [] = {13,46,108,24,52,20,9,1};
       int result[] = new int[arr.length];
       
       mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int [] arr, int left, int right){
        if(left > right){
            return;
        }

        int mid = left + (right - left)/2;
        mergeSort(arr, left, mid); 
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid,right);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
