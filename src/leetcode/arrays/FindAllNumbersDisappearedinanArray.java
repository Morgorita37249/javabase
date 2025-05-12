package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length+1; i++) {
            result.add(0);
        }

        for (int i = 0; i < nums.length; i++) {
            result.set(nums[i],1);
        }
        int size = result.size()-1;
        for (int i = size; i >= 0; i--) {
            if (result.get(i)!=0){
                result.remove(i);
            }else{
                result.set(i,i);
            }
        }
        result.remove(0);
        return result;
    }
}
