package leetcode.arrays;

import javax.crypto.spec.PSource;

public class SortArrayByParity {
    public static void main(String[] args) {
        int [] arr = {0};
        System.out.println(sortArrayByParity(arr));
    }
    public  static int [] sortArrayByParity(int[] nums) {
        int idx = 0;
        for (int i = 0;i< nums.length; i++){
            if (nums[i]%2==0){
                int tmp =nums[idx];
                nums[idx] = nums[i];
                nums[i] = tmp;
                idx++;
            }
        }

        return nums;
    }
}
