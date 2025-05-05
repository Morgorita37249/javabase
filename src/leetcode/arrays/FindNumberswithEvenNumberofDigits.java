package leetcode.arrays;
//Given an array nums of integers, return how many of them contain an even number of digits.

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int [] nums = new int[1];
        nums[0] = 100000;
        int count = 0;
        for (int i =0;i<nums.length; i++){
            int digits=1;
            int number = nums[i];
            while (number>=10){
                digits++;
                number=number/10;
            }
            if (digits%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i =0;i<nums.length; i++){
            int digits=1;
            int number = nums[i];
            while (number>=10){
                digits++;
                number=number/10;
            }
            if (digits%2==0){
                count++;
            }
        }
        return count;
    }
}
