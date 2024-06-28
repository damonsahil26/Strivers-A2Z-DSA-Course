package Hashing;

import java.util.HashMap;

public class HighLowFreq {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,2};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxKey = 0;
        int minKey = 0;

        for(int key : hm.keySet()){
            if(max < hm.get(key)){
                max = hm.get(key);
                maxKey = key;
            }
            if(min > hm.get(key)){
                min = hm.get(key);
                minKey = key;
            }
        }

        System.out.print(maxKey + " " + minKey);
    }
}
