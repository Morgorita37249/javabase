package leetcode.arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int [] nums = {0,2,4,5,6,7};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int idx=0;
        for (int i =0;i<nums.length-1; i++){
            if (nums[i]!=nums[i+1]){
                idx++;
            }
            nums[idx] = nums[i+1];
        }
        return idx;
    }
}
