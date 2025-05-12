package leetcode.arrays;

public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int [] nums = {4,0,0};
        System.out.println(replaceElements(nums));
    }
    public static int[] replaceElements(int[] arr) {
        int idx_1 = arr.length-1;
        int first_el = arr[0];
        int max =-1 ;
        int tmp = arr[idx_1];
        arr[idx_1] = -1;
        for (int i = arr.length-1;i!=0;i--){
            if(tmp > max){
                max = tmp;
            }
            tmp = arr[i-1];
            arr[i-1] = max;
        }
        return arr;
    }
}
