package Arrays.Easy;

public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = {1 ,8 ,7 ,56 ,90};
        int arr2[] = {1,2,3,4,5,6,7,8};
        boolean isSorted = true;
        int n = arr2.length;
        for(int i = 0; i < n-1; i++){
            if(arr2[i] > arr2[i+1]){
                isSorted = false;
            }
        }
            System.out.println(isSorted);
    }
}
