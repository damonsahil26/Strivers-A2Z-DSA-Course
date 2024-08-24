package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1 ,8 ,7 ,56 ,90};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(arr[i], max);
        }
        
        System.out.println(max);
    }
}
