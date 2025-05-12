package leetcode.arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int [] nums = {5,1,2,3,4};
        System.out.println(heightChecker(nums));
    }
    public static int heightChecker(int[] heights) {
        int cnt = 0;
        int[] ideal = heights.clone();
        Arrays.sort(ideal);
        for (int i = 0; i < heights.length; i++) {
            if (ideal[i]!=heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
