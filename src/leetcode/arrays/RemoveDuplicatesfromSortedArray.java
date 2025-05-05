package leetcode.arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int [] nums  = {1,1,2} ;
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int idx_new = 0;
        for (int i = 0;i<nums.length-1;i++ ){
            if (nums[i] != nums [i+1]){
                nums[idx_new+1] = nums [i+1];
                idx_new ++;
            }
        }
        return idx_new+1;
    }
}
