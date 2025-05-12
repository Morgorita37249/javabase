package leetcode.arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[idx] = nums[i];
                idx++;
                if (idx!=i+1) nums[i]=0;
            }
        }
    }
}
