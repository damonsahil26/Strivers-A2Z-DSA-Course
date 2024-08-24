package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1 ,8 ,7 ,56 ,90,1,6,3,11,0, 82};
        int n = arr.length;
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                secondMax = max;
                max = arr[i];
            }
            else if(max > arr[i]){
                if(secondMax < arr[i]){
                    secondMax = arr[i];
                }
            }
        }

        System.out.println(secondMax);
    }
}
