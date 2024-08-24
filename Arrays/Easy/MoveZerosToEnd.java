package Arrays.Easy;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int nums[] = {0,0,12,0,0};
        if(nums.length == 1)
        return;

        int i = 0, j = 1;

            while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }

            else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]);
        }
    }
}
