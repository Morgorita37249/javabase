package leetcode.arrays;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int [] nums = {424,915,193,591,923};
        threeConsecutiveOdds(nums);
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                count++;
            }else{
                if (max_count < count)  max_count = count;
                count =0;
            }
        }
        if (max_count < count)  max_count = count;
        if (max_count >= 3){
            return true;
        }
        return false;
    }

}
