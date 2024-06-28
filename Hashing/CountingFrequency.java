package Hashing;

import java.util.HashMap;

public class CountingFrequency {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i = 0; i < arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        for(int key : hm.keySet()){
            System.out.println(key + " " + hm.get(key));
        }
    }
}
