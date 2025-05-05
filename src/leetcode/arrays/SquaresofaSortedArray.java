package leetcode.arrays;

import java.util.Arrays;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int [] nums = {-10000,-9999,-7,-5,0,0,10000};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int currentSize = nums.length-1;
        int [] sorted = new int [nums.length];
        int left_elem = 0;
        int right_elem = nums.length-1;

        if (nums.length==1){
            sorted[0] = nums[0]*nums[0];
            return sorted;
        }

        while (left_elem != right_elem){
            if (nums[left_elem]*nums[left_elem] > nums[right_elem]*nums[right_elem]){
                sorted[currentSize] = nums[left_elem]*nums[left_elem];
                left_elem++;
                currentSize--;
            } else if (nums[left_elem]*nums[left_elem] <  nums[right_elem]*nums[right_elem]){
                sorted[currentSize] = nums[right_elem]*nums[right_elem];
                right_elem--;
                currentSize--;
            } else {
                sorted[currentSize] = nums[right_elem]*nums[right_elem];
                currentSize--;
                sorted[currentSize] = nums[left_elem]*nums[left_elem];
                currentSize--;
                left_elem++;
                right_elem--;
            }
            if (currentSize==-1){
                break;
            }
            if (left_elem == right_elem){
                sorted[0] = nums[right_elem]*nums[right_elem];
            }
        }
        return sorted;

    }
}
