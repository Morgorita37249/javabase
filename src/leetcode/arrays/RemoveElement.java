package leetcode.arrays;
/*
* Given an integer array nums and an integer val, remove all occurrences
* of val in nums in-place. The order of the elements may be changed.
* Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k,
*  to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums
* contain the elements which are not equal to val. The remaining
* elements of nums are not important as well as the size of nums.
Return k.
* */
public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {2,2,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int count_val = 0;
        int count_other = 0;
        int idx_other = 0;
        for (int i = nums.length-1;  i>= 0; i--){
            if (nums[i] == val){
                count_val++;
                if (idx_other>i){
                    nums[i] = nums[idx_other];
                    nums[idx_other] = val;
                    idx_other = i + count_other - 1;
                }
            } else {
                count_other++;
                if (idx_other == 0) {
                    idx_other = i;
                } else {
                    idx_other = i + count_other - 1;
                }
            }
        }
        return nums.length - count_val;
    }
    public int removeElement1(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
