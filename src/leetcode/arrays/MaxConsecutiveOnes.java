package leetcode.arrays;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]==1){
                count++;
                if (maxcount<=count){
                    maxcount = count;
                }
            } else {
                if (maxcount<=count){
                    maxcount = count;
                }
                count = 0;
            }
        }
        return maxcount;
    }
}
